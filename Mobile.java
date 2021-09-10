
public abstract class Mobile extends Element {

	protected Configuration config;
	protected Position position;

	public Mobile(Type t, Configuration conf, Position pos) {
		super(t);
		this.config = new Configuration(conf);
		this.position = new Position(pos);
	}

	public boolean bougerVers(Direction d) {
		Position pos = this.position.add(d);
		if (this.setPosition(pos)) {
			return true;
		}		
		
		return false;
	}

	public boolean setPosition(Position p) {
		if (this.config.estVide(p)) {
			this.position = p;
			return true;
		}

		return false;
	}

	public Position getPosition() {
		return position;

	}

}
