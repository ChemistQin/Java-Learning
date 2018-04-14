package C9.Music;

interface Instrument {
	public void adjust();
}

interface Playable {
	public void play(Note n);
}

class Wind implements Instrument, Playable {
	public String toString() {
		return "Wind";
	} 		
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
}

class Percussion implements Instrument, Playable {
	public String toString() {
		return "Percussion";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
}

class Stringed implements Instrument, Playable {
	public String toString() {
		return "Stringed";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
}

class Brass implements Instrument, Playable {
	public String toString() {
		return "Brass";
	}
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
}

class Woodwind implements Instrument, Playable {
	public String toString() {
		return "Woodwind";
	}	
	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}
}

public class Music {
	//play() 在接口Playable中而不是Instrument.
	static void tune(Playable i) {
		i.play(Note.C_SHARP);
	}
	static void tuneAll(Playable[] e) {
		for(Playable i : e)
			tune(i);
	}
	public static void main(String[] args) {
		Playable[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind(),
			};
		tuneAll(orchestra);
	}
}