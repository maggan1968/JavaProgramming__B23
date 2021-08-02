package day38_CustomClass.offerTask;

public class MJobOffers {

    public static void main(String[] args) {
        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("CA", "Los Angles", "SDET", 120000, true, false, false, false);
        offer2.setInfo("TX", "Austin", "Software Developer", 130000, true, true, true, false);
        offer3.setInfo("VA", "McLean", "QA", 110000, true, true, true, true);
        offer4.setInfo("NA", "Lav Vegas", "Scrum Master", 1250000, false, false, true, false);
        offer5.setInfo("NC", "Charlotte", "SDET", 1200000, false, true, true, false);
        offer6.setInfo("WA", "Seattle", "BA", 1350000, true, false, true, true);
        offer7.setInfo("CO", "Denver", "QE", 85000, true, true, true, true);

        Offer[] arr ={offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        System.out.println("-------------------------------------------------");




    }

}

/*
            2. write a program that can only keep the offers from your local area
	        3. write program that can remove all the offers that are not SDET or QA
	        4. write a program that can remove all the offers that are not WFH
	        5. write a program that can remove all the offers that do not have benifits
 */