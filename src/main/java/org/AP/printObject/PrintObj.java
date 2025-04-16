package org.AP.printObject;

import org.AP.account.Account;
import org.AP.p.P;

public class PrintObj {
    public static void printObj(Account account) {
        P.ln(Account.toString(account));
    }
}
