

public class Player {
	private String Name;	//選手名
	private String Position;//ポジション
	private int Point; //総合値
	private String club; //所属クラブ
	
	
	public String getName() {
		return Name;
	}
	public String getPosition() {
		return Position;
	}
	public int getPoint() {
		return Point;
	}
	public String getClub() {
		return club;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public void setPoint(int point) {
		Point = point;
	}
	public void setClub(String club) {
		this.club = club;
	}
	

}
