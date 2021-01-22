public class Fridge {
    private double ipsos, mikos, vathos, KatanalosiEnergias;
    private String OnomaKataskevasti, OnomaSiskevis, TiposSiskevis;

    private double SinolikiHoritikotita;
    private boolean NoFrost, Entihizomeno, EjodosGiaPagakia, WiFi;
    /*dehete to i san timi*/
    public Fridge(int i) {
    }
    /*dehete times gia oles tis metavlites tis klasis*/
    public Fridge(double ipsos, double mikos, double vathos, double katanalosiEnergias, String onomaKataskevasti, String onomaSiskevis, String tiposSiskevis, double sinolikiHoritikotita, boolean noFrost, boolean entihizomeno, boolean ejodosGiaPagakia, boolean WiFi) {

        this.ipsos = ipsos;
        this.mikos = mikos;
        this.vathos = vathos;
        this.OnomaKataskevasti = onomaKataskevasti;
        this.OnomaSiskevis = onomaSiskevis;
        this.TiposSiskevis = tiposSiskevis;
        this.KatanalosiEnergias = katanalosiEnergias;
        this.SinolikiHoritikotita = sinolikiHoritikotita;
        this.NoFrost = noFrost;
        this.Entihizomeno = entihizomeno;
        this.EjodosGiaPagakia = ejodosGiaPagakia;
        this.WiFi = WiFi;
    }
    /*dini times stis metavlites tis klasis*/
    public Fridge(double ipsos, double mikos){
        this.ipsos = 203.0;
        this.mikos = 59.5;
        this.vathos = 68.2;
        this.OnomaKataskevasti = "LG";
        this.OnomaSiskevis = "GBP56SSNKN";
        this.TiposSiskevis = "Fridge";
        this.KatanalosiEnergias = 334;
    }
    /*dini times stis metavlites tis klasis*/
    public Fridge(){
        this.SinolikiHoritikotita = 384;
        this.NoFrost = true;
        this.Entihizomeno = false;
        this.EjodosGiaPagakia = true;
        this.WiFi = true;
    }
    private static int ArithmosAntikimenon = 0;{

        ArithmosAntikimenon = ArithmosAntikimenon+1;
    }
    public static int getArithmosAntikimenon(){ return ArithmosAntikimenon; }

    public double getIpsos() { return ipsos; }

    public void setIpsos(double ipsos) { this.ipsos = ipsos; }

    public double getMikos() { return mikos; }

    public void setMikos(double mikos) { this.mikos = mikos; }

    public double getVathos() { return vathos; }

    public void setVathos(double vathos) { this.vathos = vathos; }

    public String getOnomaKataskevasti() { return OnomaKataskevasti; }

    public void setOnomaKataskevasti(String onomaKataskevasti) { OnomaKataskevasti = onomaKataskevasti; }

    public String getOnomaSiskevis() { return OnomaSiskevis; }

    public void setOnomaSiskevis(String onomaSiskevis) { OnomaSiskevis = onomaSiskevis; }

    public String getTiposSiskevis() { return TiposSiskevis; }

    public void setTiposSiskevis(String tiposSiskevis) { TiposSiskevis = tiposSiskevis; }

    public double getKatanalosiEnergias() { return KatanalosiEnergias; }

    public void setKatanalosiEnergias(double katanalosiEnergias) { KatanalosiEnergias= katanalosiEnergias; }

    public double getSinolikiHoritikotita() { return SinolikiHoritikotita; }

    public void setSinolikiHoritikotita(double sinolikiHoritikotita) { SinolikiHoritikotita = sinolikiHoritikotita; }

    public boolean isNoFrost() { return NoFrost; }

    public void setNoFrost(boolean noFrost) { NoFrost = noFrost; }

    public boolean isEntihizomeno() { return Entihizomeno; }

    public void setEntihizomeno(boolean entihizomeno) { Entihizomeno = entihizomeno; }

    public boolean isEjodosGiaPagakia() { return EjodosGiaPagakia; }

    public void setEjodosGiaPagakia(boolean ejodosGiaPagakia) { EjodosGiaPagakia = ejodosGiaPagakia; }

    public boolean isWiFi() { return WiFi; }

    public void setWiFi(boolean wiFi) { WiFi = wiFi; }
    /* den kanei tipota (etsi zitithike apo tin askisi)
    */
    public void periodicMantainance(){
    }
    /*tiponi tis times ton vasikon metavliton tis klasis
     se katalila diamorfomeno kimeno
     */
    public void VasikaHaraktiristika(){
        System.out.println("To ipsos einai:"+ipsos+"cm");
        System.out.println("To mikos einai:"+mikos+"cm");
        System.out.println("To vathos einai:"+vathos+"cm");
        System.out.println("To onoma tou kataskevasti einai:"+OnomaKataskevasti);
        System.out.println("To onoma tis siskevis einai:"+OnomaSiskevis);
        System.out.println("O tipos tis siskevis einai:"+TiposSiskevis);
        System.out.println("H katanalosi energias einai:"+ KatanalosiEnergias+"kWh/y");
    }
    /*tiponi tis times ton idikon haraktiristikon tis klasis
    se katalila diamorfomeno kimeno
     */
    public void IdikaHaraktiristika(){
        System.out.println("NoFrost:"+ NoFrost);
        System.out.println("Entihizomeno:"+ Entihizomeno);
        System.out.println("Ejodos gia pagakia:"+ EjodosGiaPagakia);
        System.out.println("WiFi:"+ WiFi);
        System.out.println("H sinoliki horitikotita einai:"+SinolikiHoritikotita+"lt");
    }
}