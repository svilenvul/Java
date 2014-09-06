package recordlabel;


public class RecordLabelTest {

	public static void main(String[] args) {
		RecordLabel virginia = new RecordLabel
				("Virginia Records","USA, 22343 California, Melody str.","Jimmy Lexton");
		Singer robby = new Singer("Robert Williams", "Robby Williams");
		virginia.addSinger(robby);
		Album upAndDown = new Album ("Going up and down",Genre.POP,2002,500000);
		Album linderboock = new Album ("Take you there", Genre.POP, 2003, 30000);
		robby.addAlbum(upAndDown);
		robby.addAlbum(linderboock);
		Song one = new Song ("I dont wanna miss a thing", 2.05);
		Song two = new Song("Look me in the eyes", 4.45);		
		upAndDown.addSong(one);
		upAndDown.addSong(two);
		Singer dealay = new Singer("Jan Delay","Jan Delay");
		virginia.addSinger(dealay);
		System.out.print(virginia);
	}

}
