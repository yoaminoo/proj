package org.AP.printObject;

import org.AP.account.Account;
import org.AP.p.P;
import org.AP.toString.ToString;

public class PrintObj {
    public static void printObj(Account account) {
        P.ln(ToString.toString(account));
    }
}
