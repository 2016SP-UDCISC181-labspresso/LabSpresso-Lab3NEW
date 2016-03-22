package pokerEnums;

public enum eCardNo {

	FirstCard(0), SecondCard(1), ThirdCard(2), FourthCard(3), FifthCard(4), NONE(999);
	
	private eCardNo(final int CardNo){
		this.CardNo = CardNo;
	}

	private int CardNo;
	
	public int getCardNo(){
		return CardNo;
	}
	
	//used this answer to get an enum from the enum card number
	//http://stackoverflow.com/a/14217289/5994027
    public boolean Compare(int i){return CardNo == i;}
    public static eCardNo GetValue(int _id)
    {
    	eCardNo[] eCardNos = eCardNo.values();
        for(int i = 0; i < eCardNos.length; i++)
        {
            if(eCardNos[i].Compare(_id))
                return eCardNos[i];
        }
        return eCardNo.NONE;
    }
	
}
