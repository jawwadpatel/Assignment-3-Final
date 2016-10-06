/*
 * Decompiled with CFR 0_115.
 */
package library.daos;

import java.util.Date;
import entities.Loan;
import library.interfaces.daos.ILoanHelper;
import library.interfaces.entities.IBook;
import library.interfaces.entities.ILoan;
import library.interfaces.entities.IMember;

public class LoanHelper
implements ILoanHelper {
    @Override
    public ILoan makeLoan(IBook book, IMember borrower, Date borrowDate, Date dueDate) {
        return new Loan(book, borrower, borrowDate, dueDate);
    }
}

