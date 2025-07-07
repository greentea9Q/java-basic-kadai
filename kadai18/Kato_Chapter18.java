package text.kadai18;

abstract class Kato_Chapter18 {
	
	public String familyName = "加藤";
	
	public String givenName  = "";
	
	public String addres = "東京都中野区●×";
	
	public void commonIntroduce() {
        System.out.println("私は" + familyName + givenName + "です。");
        System.out.println( addres + "に住んでいます。");
	}
        
        public abstract void eachIntroduce();

        public void execIntroduce() {
            commonIntroduce();
            eachIntroduce();

	}
}
