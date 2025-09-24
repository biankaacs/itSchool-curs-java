package org.example.session34;


class SistemLumini{
    public void stingeLumina(){
        System.out.println("Luminile s-au stins");
    }
}

class SistemAudio{
    public void pornesteSistemulAudio(){
        System.out.println("Sistemul audio a pornit");
    }
}

class SistemVideo{
    public void pornesteVideoProiector(){
        System.out.println("Video proiectorul a pornit");
    }
}

class SistemDraperii{
    public void trageDraperiile(){
        System.out.println("Draperiile trase");
    }
}

class HomeCinemaFacade{
    private SistemLumini sistemLumini;
    private SistemAudio sistemAudio;
    private SistemVideo sistemVideo;
    private SistemDraperii sistemDraperii;

    public HomeCinemaFacade() {
        this.sistemLumini = new SistemLumini();
        this.sistemAudio = new SistemAudio();
        this.sistemVideo = new SistemVideo();
        this.sistemDraperii = new SistemDraperii();
    }


    public void pornesteFilm(){
        sistemDraperii.trageDraperiile();
        sistemLumini.stingeLumina();
        sistemAudio.pornesteSistemulAudio();
        sistemVideo.pornesteVideoProiector();
        System.out.println("Vizionare placuta!");
    }
}


public class Facade {
    public static void main(String[] args) {
        HomeCinemaFacade facade = new HomeCinemaFacade();
        facade.pornesteFilm();
    }
}
