import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ColetorDados {
    public List<Meta> collectData() {
        List<Meta> metas = new ArrayList<>();
        metas.add(new Meta(1, "Reduzir e-waste em 20%", LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31), 15));
        metas.add(new Meta(2, "Aumentar a reciclagem de materiais em 30%", LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31), 25));
        return metas;
    }
}
