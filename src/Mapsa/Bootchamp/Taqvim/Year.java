package Mapsa.Bootchamp.Taqvim;

public class Year {

    private int OurMonth;
    private int OurDay;

    private static final int month=12;
    private static final int dayForFirstHalf=31;//number of days in month for the first half of the year
    private static final int dayForSecondHalf=30;//number of days in month for the second half of the year exept esfand
    private static final int dayForEsfand=29;

    public Year(int Mymonth,int Myday) {

        if(Mymonth>0 && Mymonth<=month)
            this.OurMonth=Mymonth;

        if(Mymonth>0 && Mymonth<=6){
            if(Myday>0 && Myday<=dayForFirstHalf)
                this.OurDay=Myday;
        }else if(Mymonth>0 && Mymonth<=11){
            if(Myday>0 && Myday<=dayForSecondHalf)
                this.OurDay=Myday;
        }else if(Mymonth==12){
            if(Myday>0 && Myday<=dayForEsfand)
                this.OurDay=Myday;
        }

    }

    public int getOurDay() {
        return OurDay;
    }

    public int getOurMonth() {
        return OurMonth;
    }


}
