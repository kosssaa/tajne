package pl.com.tajne.sklep_komputerowy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Komputer {


    int identyfikatorProduktu;
    double częstotliwośćProcesora;
    boolean czyProcesorMaTurbo;
    double wielkośćPamięciRAM;
    double wielkośćDysku;
    double cena;
    int ilośćProcesorów;
    String nazwa; //model/nazwa/marka
    int pobieranaMoc; // moc w kW}
}