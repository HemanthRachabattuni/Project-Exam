package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AppService {

    @Autowired
    private AppRepository repo;

    public List<Survey> listAll() {
        return repo.findAll();
    }

    public void save(Survey survey) {
        repo.save(survey);
    }

    public Survey get(int id) {
        return repo.findById((long) id).get();
    }

}
