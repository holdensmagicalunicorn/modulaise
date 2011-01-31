package dk.exenova.ant;

import java.util.Random;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;
import java.util.Date;
import java.text.SimpleDateFormat;


public class BuildNamer extends Task {
	Random random = new Random(System.currentTimeMillis());
	private String property;
	private String[] firstName = {
			"Able",
			"Absalon",
			"Ace",
			"Aloud",
			"Ample",
			"Applied",
			"Aquacade",
			"Aqua",
			"Arc",
			"Arctic",
			"Ardent",
			"Arena",
			"Argus",
			"Arrow",
			"Ash",
			"Atlas",
			"Aurora",
			"Autumn",
			"Back",
			"Bald",
			"Ball",
			"Baltic",
			"Balikatan",
			"Bamboo",
			"Bare",
			"Barrel",
			"Beach",
			"Best",
			"Beverly",
			"Big",
			"Bold",
			"Bonus",
			"Briar",
			"Brick",
			"Bright",
			"Brilliant",
			"Brim",
			"Bubble",
			"Buck",
			"Buffalo",
			"Bulk",
			"Bundle",
			"Bunk",
			"Bus",
			"Bush",
			"Busy",
			"Butter",
			"Cache",
			"Capstone",
			"Cast",
			"Chalet",
			"Chalk",
			"Check",
			"Chrome",
			"Church",
			"Clarinet",
			"Classic",
			"Clear",
			"Clipper",
			"Close",
			"Cloud",
			"Cold",
			"College",
			"Comet",
			"Comfy",
			"Compass",
			"Constant",
			"Cool",
			"Cope",
			"Copper",
			"Corn",
			"Corona",
			"Coronet",
			"Cover",
			"Credible",
			"Creek",
			"Crew",
			"Cross",
			"Cutlass",
			"Dancing",
			"Deep",
			"Determined",
			"Dial",
			"Distant",
			"Dive",
			"Dolly",
			"Double",
			"Draw",
			"Duck",
			"Dust",
			"Eagle",
			"Early",
			"Eight",
			"Electric",
			"Elegant",
			"Ember",
			"End",
			"Enhance",
			"Face",
			"Fair",
			"Fast",
			"Fennel",
			"Fire",
			"Flare",
			"Floating",
			"Forest",
			"Forward",
			"Four",
			"Frantic",
			"Fresh",
			"Gallant",
			"Game",
			"Garlic",
			"Gentle",
			"Ghost",
			"Giant",
			"Gigantic",
			"Gin",
			"Girdle",
			"Glad",
			"Glass",
			"Glowing",
			"Golden",
			"Goose",
			"Grass",
			"Green",
			"Hammer",
			"Hard",
			"Harvest",
			"Hasty",
			"Haven",
			"Head",
			"Heavy",
			"High",
			"Idealist",
			"Iron",
			"Ivory",
			"Jazz",
			"Jet",
			"Jolly",
			"Jumping",
			"Keen",
			"King",
			"Large",
			"Left",
			"Linear",
			"Link",
			"Little",
			"Locker",
			"Long",
			"Loop",
			"Lucky",
			"Magnus",
			"Main",
			"Maple",
			"March",
			"Market",
			"Meteor",
			"Mighty",
			"Mine",
			"Misty",
			"Mobile",
			"Moon",
			"Music",
			"Mystic",
			"Nice",
			"Nickel",
			"Night",
			"Nimbus",
			"Noble",
			"Northern",
			"Ocean",
			"Office",
			"Olive",
			"Omega",
			"Open",
			"Owl",
			"Pacer",
			"Pencil",
			"Phoenix",
			"Pilot",
			"Point",
			"Polar",
			"Polo",
			"Pony",
			"Port",
			"Post",
			"Power",
			"Practice",
			"Prime",
			"Prize",
			"Promise",
			"Proud",
			"Quick",
			"Quiet",
			"Ranch",
			"Ready",
			"Rolling",
			"Round",
			"Rusty",
			"Safe",
			"Salty",
			"Sauce",
			"Savage",
			"Science",
			"Scope",
			"Sea",
			"Seek",
			"Senior",
			"Sentinel",
			"Service",
			"Seven",
			"Shed",
			"Sheepwalk",
			"Shining",
			"Ship",
			"Short",
			"Silent",
			"Silk",
			"Silver",
			"Sky",
			"Sleigh",
			"Smart",
			"Sneaky",
			"Solid",
			"South",
			"Southern",
			"Speckled",
			"Speed",
			"Square",
			"Squeeze",
			"Star",
			"Starfish",
			"Stray",
			"Strong",
			"Sugar",
			"Suitcase",
			"Sun",
			"Sure",
			"Surprise",
			"Tacit",
			"Talon",
			"Tan",
			"Tea",
			"Teak",
			"Ten",
			"Thin",
			"Third",
			"Thirst",
			"Tiger",
			"Top",
			"Traffic",
			"Tree",
			"Trophy",
			"Trout",
			"True",
			"Tuba",
			"Union",
			"Upgrade",
			"Upgun",
			"Uphold",
			"Upper",
			"Urgent",
			"Vigilant",
			"Wedding",
			"West",
			"Wet",
			"Wing",
			"Wired",
			"Woodland",
			"Yankee",
			"Yellow",
			"Young"
	};
	
	@Override
	public void execute() throws BuildException {
		
		getProject().setNewProperty(property, getTimeStamp()+"-"+getRandomFromArray(firstName)+"-"+String.valueOf(getRandomFromArray(firstName)));
	}

	private String getTimeStamp(){
		SimpleDateFormat simpleDateFormatDate = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat simpleDateFormatHours = new SimpleDateFormat("HHmm");
		return simpleDateFormatDate.format(new Date())+"T"+simpleDateFormatHours.format(new Date());
	}
	
	protected String getRandomFromArray(String[] source){
		int randomInt = calculateRandom(0, (source.length-1));
		return source[randomInt];
	}

	protected int calculateRandom(int minInt, int maxInt) {
		return minInt + random.nextInt(maxInt - minInt + 1);
	}

	public void setProperty(String property) {
		this.property = property;
	}
}