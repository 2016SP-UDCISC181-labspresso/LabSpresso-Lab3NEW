package pokerEnums;

public enum eRank {
	TWO(2), 
	THREE(3), 
	FOUR(4), 
	FIVE(5), 
	SIX(6), 
	SEVEN(7), 
	EIGHT(8), 
	NINE(9), 
	TEN(10), 
	JACK(11), 
	QUEEN(12), 
	KING(13), 
	ACE(14),
	JOKER(99),
	NONE(999);

	private int iRankNbr;

	private eRank(int iRankNbr) {
		this.iRankNbr = iRankNbr;
	}

	public int getiRankNbr() {
		return iRankNbr;
	}

	//used this answer to get an enum from the enum rank number
	//http://stackoverflow.com/a/14217289/5994027
    public boolean Compare(int i){return iRankNbr == i;}
    public static eRank GetValue(int _id)
    {
    	eRank[] eRanks = eRank.values();
        for(int i = 0; i < eRanks.length; i++)
        {
            if(eRanks[i].Compare(_id))
                return eRanks[i];
        }
        return eRank.NONE;
    }
	
}
