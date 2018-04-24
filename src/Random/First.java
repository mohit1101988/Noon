package Random;

//Comment added to new branch
public class First {

	public static void main(String[] args) {
		
		
		////System.out.println(getFare(3,54,4));
		

	}

	/*public static int[] slab(int daycount){
		
		int[] slab1= new int[10,20,30,40];
		int[] slab2= new int[35,45,55,65];
		
		if (daycount >1 & daycount <5){
			return slab1
		}
		else{
			return slab2
		}
 	}*/
	public static double getFare(int stops, int age, int entryhours) {
		
		double undiscountedFare = 0;
		
		/*boolean applypeakpricing;
		boolean applyageconcession;
		boolean applynightDiscount;
		
		
		if (age>60){
			applyageconcession = True;
			}*/
		
		/*if (applyageconcession){
			undiscountedFare = undiscountedFare * .8;
			}*/
		
			
		if (stops >=1 && stops <=4){
			undiscountedFare = 10;
		}
		else if (stops >=5 && stops <=10){
			undiscountedFare = 25;	
		}
		else if (stops >=10 && stops <=20){
			undiscountedFare = 40;	
		}
		else if (stops > 20){
			undiscountedFare = 55;	
		}
		
		if (age>60){
			undiscountedFare = undiscountedFare * .8;
			}
		
		if (entryhours >= 8 || entryhours <= 10){
			undiscountedFare = undiscountedFare * 1.1;
		}
		else if (entryhours >= 23 || entryhours <= 7){
			undiscountedFare = undiscountedFare * 0.9;
		}
		
		return undiscountedFare;
		
		
		
	}

}
