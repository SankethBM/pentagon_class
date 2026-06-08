public class Airport {
    void allowPlane(Plane ref) {
        ref.to();
        ref.fly();
        ref.land();
        if (ref instanceof CP cp) {     
            cp.crash();
        }
    }
}
