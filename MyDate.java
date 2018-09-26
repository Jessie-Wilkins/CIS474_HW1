public class MyDate{
	private int my_date_;
	private String my_date1;
	
	public MyDate(int date) {
		SetMyDate(date);
	
	}

	public MyDate(String date) {
		SetMyDate(date);
		
	}
	
	public void SetMyDate(int date) {
		//assume that the date will be in the format yyyymmdd
		//date is an integer
		my_date_ = date;
	}
	
	public void SetMyDate(String date) {
		//assume that the date will be in the format mm/dd/yyyy
		my_date1 = date;
	}
	
	public int GetMyDate() {
		return my_date_;
	}
	
	public String GetMyDateString() {
		//please return a date string in the format yyyymmdd
		String [] str_array = my_date1.split("/");
		String my_date2 = String.join("",str_array[2],str_array[0],str_array[1]);
		return my_date2;
	}
	
	public String GetMyDateString1() {
		//please return a date string in the format of mm/dd/yyyy
		String [] str_array = my_date1.split("/");
		String my_date2 = String.join("/",str_array[0],str_array[1],str_array[2]);
		return my_date2;
	}
	
	public String GetMyDateString2() {
            // return null;
		//please return a date string in the format of dd/mm/yyyy
               String [] str_array = my_date1.split("/");
               String my_date = String.join("",str_array[1],"/",str_array[0], "/", str_array[2]);
		return my_date; 
	}
	
	public boolean IsLeapYear(int year) {
		//please return true if the year is a leap year
		//return false if the year is not a leap year
		if(year%4 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	
}