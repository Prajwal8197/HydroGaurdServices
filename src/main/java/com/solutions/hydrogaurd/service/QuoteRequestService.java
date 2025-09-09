package com.solutions.hydrogaurd.service;

import com.solutions.hydrogaurd.model.QuoteRequest;
import com.solutions.hydrogaurd.repository.QuoteRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuoteRequestService {
    @Autowired
    private QuoteRequestRepository quoteRequestRepository;

    public List<QuoteRequest> getAllQuotes() {
        return quoteRequestRepository.findAll();
    }

    public QuoteRequest createQuote(QuoteRequest quoteRequest) {
        return quoteRequestRepository.save(quoteRequest);
    }

    public void deleteQuote(Long id) {
        quoteRequestRepository.deleteById(id);
    }
}
