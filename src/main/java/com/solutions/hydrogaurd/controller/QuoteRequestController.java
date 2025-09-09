package com.solutions.hydrogaurd.controller;

import com.solutions.hydrogaurd.model.QuoteRequest;
import com.solutions.hydrogaurd.service.QuoteRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/quotes")
public class QuoteRequestController {
    @Autowired
    private QuoteRequestService quoteRequestService;

    @GetMapping
    public List<QuoteRequest> getAllQuotes() {
        return quoteRequestService.getAllQuotes();
    }

    @PostMapping
    public QuoteRequest createQuote(@RequestBody QuoteRequest quoteRequest) {
        return quoteRequestService.createQuote(quoteRequest);
    }

    @DeleteMapping("/{id}")
    public void deleteQuote(@PathVariable Long id) {
        // TODO: Add admin authentication check
        quoteRequestService.deleteQuote(id);
    }
}
