import java.util.Scanner;

class InsufficientBalance extends Exception 
{
    public InsufficientBalance (String message) 
    {
        super (message);
    }
}

class InvalidAccountNumber extends Exception 
{
    public InvalidAccountNumber (String message) 
    {
        super (message);
    }
}

class Operations 
{

    public void validateAccount (String accNumber) throws InvalidAccountNumber 
    {
        if (!accNumber.matches("\\d{6}")) 
        {
            throw new InvalidAccountNumber ("Invalid Account Number. Must be 6 digits only.");
        }
    }
    public double withdraw (double balance, double amount) throws InsufficientBalance 
    {
        if (amount > balance) 
        {
            throw new InsufficientBalance ("Insufficient balance to withdraw " + amount + ".");
            // throw new InsufficientBalance (amount);
        }
        System.out.println ("Withdrawal successful.\nRemaining balance: Rs. " + (balance - amount));
        return balance - amount;
    }
    public double deposit (double balance, double amount) 
    {
        balance += amount;
        System.out.println ("Deposit successful.\nNew balance: Rs. " + balance);
        return balance;
    }
}

public class Practical5 
{
    public static void main (String[] args) 
    {
        Scanner p = new Scanner (System.in);
        Operations op = new Operations ();
        try 
        {
            System.out.print ("Enter your 6-digit account number: ");
            String accountNumber = p.next();
            op.validateAccount (accountNumber);
            System.out.print ("Enter your current balance: ");
            double balance = p.nextDouble();
            System.out.print ("Do you want to withdraw or deposit (W/D)?: ");
            char choice = p.next().toLowerCase().charAt(0);
            if (choice == 'w') 
            {
                System.out.print ("Enter amount to withdraw: ");
                double amount = p.nextDouble();
                balance = op.withdraw (balance, amount);
            } 
            else if (choice == 'd') 
            {
                System.out.print ("Enter amount to deposit: ");
                double amount = p.nextDouble();
                balance = op.deposit (balance, amount);
            } 
            else 
            {
                System.out.println ("Invalid choice. Please enter 'w' for withdraw or 'd' for deposit.");
            }
        } 
        catch 
        (InvalidAccountNumber e) 
        {
            System.out.println ("Account Number Error: " + e.getMessage());
        } 
        catch (InsufficientBalance e) 
        {
            System.out.println ("Balance Error: " + e.getMessage());
            // System.out.println ("Balance Error: " + e);
        } 
        finally 
        {
            System.out.println ("End of transaction.");
            p.close();
        }
    }
}