package repository;

import model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    // Search expenses by category
    List<Expense> findByCategory(String category);

    // Search expenses by title (case-insensitive)
    List<Expense> findByTitleContainingIgnoreCase(String title);

}