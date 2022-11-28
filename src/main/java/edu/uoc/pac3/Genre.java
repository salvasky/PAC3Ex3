package edu.uoc.pac3;

public enum Genre {
    ACTION("Movies with shots, explosions, etc.", "A"){
        public Genre next(){
            return ADVENTURE;
        }
    },
    ADVENTURE("Thousands of things happen", "ADV"){
        public Genre next(){
            return COMEDY;
        }
    },
    COMEDY("Lot of laughs", "C"){
        public Genre next(){
            return DRAMA;
        }
    },
    DRAMA("Plenty of sadness", "D"){
        public Genre next(){
            return FANTASY;
        }
    },
    FANTASY("Imaginary friends", "F"){
        public Genre next(){
            return HORROR;
        }
    },
    HORROR("Screams", "H"){
        public Genre next(){
            return MUSICAL;
        }
    },
    MUSICAL("La, la, la", "M"){
        public Genre next(){
            return ROMANCE;
        }
    },
    ROMANCE("Love, love and much love", "R"){
        public Genre next(){
            return SCIFI;
        }
    },
    SCIFI("Aliens, time travels and so on", "SF"){
        public Genre next(){
            return THRILLER;
        }
    },
    THRILLER("Crimes, clues, policemen...", "T"){
        public Genre next(){
            return WESTERN;
        }
    },
    WESTERN("Bang!!! Movies wanted", "W"){
        public Genre next(){
            return ACTION;
        }
    };




    private String description;

    private String abbreviation;


    private Genre(String description, String abbreviation){
        this.description = description;
        this.abbreviation = abbreviation;
    }

    public String getDescription() {
        return description;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static Genre getGenre(String abbreviation){
       for (var element : values()){
           if (element.abbreviation.equals(abbreviation)){
               return element;
           }
       }
        return null;
    }

    public static String getAbbreviationByIndex(int index) {
        if (index < 0) {
            return String.valueOf(Genre.values()[0].abbreviation);
        } else if (index >= Genre.values().length ) {
            return String.valueOf(Genre.values()[Genre.values().length -1].abbreviation);
        } else {
            return String.valueOf(Genre.values()[index].abbreviation);
        }
    }

    public abstract Genre next();


}
