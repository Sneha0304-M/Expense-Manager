package service;

import model.Expense;
import java.util.List;

public interface ExpenseService {

    Expense addExpense(Expense expense);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id, Expense expense);

    void deleteExpense(Long id);

    List<Expense> getExpensesByCategory(String category);

    List<Expense> searchExpensesByTitle(String title);

    Double getTotalExpense();
}