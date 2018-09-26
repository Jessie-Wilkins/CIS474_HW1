public class StockSimulation{
	public static void main(String[] args) {


		MyDate date = new MyDate("01/02/2018");
		MyDate intDate = new MyDate(20180102);
		System.out.println(intDate.GetMyDate());
		System.out.println(date.GetMyDateString());
		System.out.println(date.GetMyDateString1());
		System.out.println(date.GetMyDateString2());
		
		if(date.IsLeapYear(2018)) {
			System.out.println("2018 is a leap year");
		}else {
			System.out.println("2018 is not a leap year");
		}
		
		Stock s = new Stock("Facebook", "FB", 178.33, date);
		
		//please check that every get method in the MyDate class is correct
	}
}