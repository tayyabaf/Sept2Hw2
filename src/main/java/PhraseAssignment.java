public class PhraseAssignment {
        public static void main(String[] args) {
            String[] color  ={"red", "green", "blue", "orange", "yellow", "lavendar", "pink", "black", "white"};
            String[] brand ={"Toyota", "BMW", "Honda", "Mercedes", "Audi", "Tesla", "Chevy"};
            int[] year ={2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022};

            int colorLength = color.length;
            int brandLength = brand.length;
            int yearLength = year.length;

            int randColor = (int) (Math.random()*colorLength);
            int randBrand = (int) (Math.random()*brandLength);
            int randYear = (int) (Math.random()*yearLength);

            String phrase = "I want a " + year[randYear] + " " + brand[randBrand] + " car, preferrably in the color " + color[randColor] ;
                    System.out.println(phrase);






        }
}
