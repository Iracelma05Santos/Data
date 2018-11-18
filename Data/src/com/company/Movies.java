package com.company;

class Movies {
    public String title;
    public String director;
    public String actor;
    public int year;
    public double rating;
    public double viewers;

    Movies (String title, String director, String actor, int year, double rating, double viewers) {
        this.title=title;
        this.director=director;
        this.actor=actor;
        this.year=year;
        this.rating=rating;
        this.viewers=viewers;
    }
    public void getInfoMovies () {
        System.out.println("Фильм: " + title + "; Режисер: " + director + "; Актер: "+actor+"; Год: "+year+"; Рейтинг: "+rating+"; Просмотры: "+viewers);
    }
    public void getNewRating(double rating){
        this.rating=rating;
        System.out.println("Фильм: " + title + "; Режисер: " + director + "; Актер: "+actor+"; Год: "+year+"; Рейтинг(Новый): "+rating+"; Просмотры: "+viewers);
    }

}
