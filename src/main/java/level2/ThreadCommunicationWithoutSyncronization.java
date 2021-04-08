package level2;

//Ust global
public class ThreadCommunicationWithoutSyncronization {

	int accountNumber;

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	double accountBalance;

	ThreadCommunicationWithoutSyncronization(int actNum, double actBal) {
		this.accountBalance = actBal;
		this.accountNumber = actNum;
	}

	public void debitAmount(int debitamount) {
		if (accountBalance < debitamount) {
			System.out.println("there are not enough funds in the account");
		} else {
			accountBalance = accountBalance - debitamount;
		}
	}

	public void credit(int creditamount) {
		if( creditamount < 0.0)
		{
			System.out.println("can not deposit a negative amount");
		}
		accountBalance = accountBalance + creditamount;
	}

	public static void main(String[] args) {
		ThreadCommunicationWithoutSyncronization r = new ThreadCommunicationWithoutSyncronization(123, 5000);
		//ThreadCommunicationWithoutSyncronization r1 = new ThreadCommunicationWithoutSyncronization(123, 2000);
		Thread one = new Thread( new Runnable()
				{
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("thread1 started"+r.getAccountBalance());
						r.credit(100);
						System.out.println("credit thread1 started"+r.getAccountBalance());
						r.debitAmount(5000);
						System.out.println("debitAmount thread1 started"+r.getAccountBalance());
					}
			
				});
		Thread two = new Thread( new Runnable()
		{
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread2 started"+r.getAccountBalance());
				r.credit(100);
				System.out.println("credit thread2 started"+r.getAccountBalance());
				r.debitAmount(5000);
				System.out.println("debitAmount thread2 started"+r.getAccountBalance());
			}
	
		});
		one.setName("holder1");
		two.setName("holder2");
		one.start();
		two.start();
		try {
			one.join();
			two.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
