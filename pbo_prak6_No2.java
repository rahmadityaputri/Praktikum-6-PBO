//public class pbo_prak6_No2 {
//    public static void main(String[] args) {
//
//        System.out.println("~~ Pesawat ~~");
//        Flyer airplane = new Airplane();
//        System.out.println(airplane.takeOff());
//        System.out.println(airplane.land());
//        System.out.println(airplane.fly());
//
//        System.out.println("\n~~ Burung ~~");
//        Flyer bird = new Bird();
//        System.out.println(bird.takeOff());
//        System.out.println(bird.land());
//        System.out.println(bird.fly());
//        System.out.println(((Bird) bird).buildNest());
//        System.out.println(((Bird) bird).layEggs());
//
//        System.out.println("\n~~ Superman ~~");
//        Flyer superman = new Superman();
//        System.out.println(superman.takeOff());
//        System.out.println(superman.land());
//        System.out.println(superman.fly());
//        System.out.println(((Superman) superman).leapBuilding());
//        System.out.println(((Superman) superman).stopBullet());
//
//    }
//}
//
//interface Flyer{
//    String takeOff();
//    String land();
//    String fly();
//}
//
//class Airplane implements Flyer {
//
//    @Override
//    public String takeOff() {
//        return "# Pesawat Lepas Landas Dari Bandara Kuala Namu Ke Bandara Juanda";
//    }
//
//    @Override
//    public String land() {
//        return "# Pesawat Berhasil Mendarat Di Bandara Juanda";
//    }
//
//    @Override
//    public String fly() {
//        return "# Pesawat Terbang Selama 5 Jam";
//    }
//}
//
//class Bird implements Flyer{
//
//    @Override
//    public String takeOff() {
//        return "# Burung Puyuh Terbang Dari Ketinggian 800 Meter Diatas Permukaan Laut";
//    }
//
//    @Override
//    public String land() {
//        return "# Burung Puyuh Mendarat Tepat Pada Batang Pohon Mangga";
//    }
//
//    @Override
//    public String fly() {
//        return "# Burung Puyuh Terbang Selama 1 Jam";
//    }
//
//    public String buildNest() {
//        return "# Burung Puyuh Membangun Sarangnya Di Pohon Mangga";
//    }
//
//    public String layEggs() {
//        return "# Burung Elang Mengerami Telurnya";
//    }
//}
//class Superman implements Flyer {
//
//    @Override
//    public String takeOff() {
//        return "# Superman Terbang Dengan Sangat Cepat Menuju Tempat Kejadian Perkara";
//    }
//
//    @Override
//    public String land() {
//        return "# Superman Mendarat Di Tempat Kejadian Perkara";
//    }
//
//    @Override
//    public String fly() {
//        return "# Superman Terbang Dengan Kecepatan 120 Km/jam";
//    }
//
//    public String leapBuilding() {
//        return "# Superman Terbang Melewati Banyak Gedung Tinggi";
//    }
//
//    public String stopBullet() {
//        return "# Superman Tidak Bisa Ditembak Peluru";
//    }
//}