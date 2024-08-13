package com.arundethie.quizapp.dao;

import com.arundethie.quizapp.model.Question;
import com.arundethie.quizapp.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
