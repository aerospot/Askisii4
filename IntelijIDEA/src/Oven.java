public class Oven {
    private double ipsos, mikos, vathos, KatanalosiEnergias;
    private String OnomaKataskevasti, OnomaSiskevis, TiposSiskevis;

    private String TiposEstias, TiposFournou, Hroma;
    private boolean PsifiakiOthoni;
    private double SinolikiHoritikotita;
    /*dehete to i san timi*/
    public Oven(int i) {
    }
    /*dehete times gia oles tis metavlites tis klasis*/
    public Oven(double ipsos, double mikos, double vathos, double KatanalosiEnergias, String onomaKataskevasti, String onomaSiskevis, String tiposSiskevis, String tiposEstias, String tiposFornou, String hroma, boolean psifiakiOthoni, double sinolikiHoritikotita) {
        this.ipsos = ipsos;
        this.mikos = mikos;
        this.vathos = vathos;
        this.OnomaKataskevasti = onomaKataskevasti;
        this.OnomaSiskevis = onomaSiskevis;
        this.TiposSiskevis = tiposSiskevis;
        this.KatanalosiEnergias = KatanalosiEnergias;
        this.TiposEstias = tiposEstias;
        this.TiposFournou = tiposFornou;
        this.Hroma = hroma;
        this.PsifiakiOthoni = psifiakiOthoni;
        this.SinolikiHoritikotita = sinolikiHoritikotita;
    }
    /*dini times stis metavlites tis klasis*/
    public Oven(double ipsos, double mikos){
        this.ipsos = 85;
        this.mikos = 60;
        this.vathos = 60;
        this.OnomaKataskevasti = "PITSOS";
        this.OnomaSiskevis = "PA4039ICMDI";
        this.TiposSiskevis = "Oven";
        this.KatanalosiEnergias = 896;
    }
    /*dini times stis metavlites tis klasis*/
    public Oven(){
        this.TiposEstias = "keramiki";
        this.TiposFournou = "ilektrikos";
        this.Hroma = "Inox";
        this.PsifiakiOthoni = true;
        this.SinolikiHoritikotita = 66;

    }

    private static int ArithmosAntikimenon = 0;{

        ArithmosAntikimenon = ArithmosAntikimenon+1;
    }

    public static int getArithmosAntikimenon(){

        return ArithmosAntikimenon;
    }

    public double getIpsos() {
        return ipsos;
    }

    public void setIpsos(double ipsos) {
        this.ipsos = ipsos;
    }

    public double getMikos() {
        return mikos;
    }

    public void setMikos(double mikos) {
        this.mikos = mikos;
    }

    public double getVathos() {
        return vathos;
    }

    public void setVathos(double vathos) {
        this.vathos = vathos;
    }

    public String getOnomaKataskevasti() {
        return OnomaKataskevasti;
    }

    public void setOnomaKataskevasti(String onomaKataskevasti) {
        OnomaKataskevasti = onomaKataskevasti;
    }

    public String getOnomaSiskevis() {
        return OnomaSiskevis;
    }

    public void setOnomaSiskevis(String onomaSiskevis) {
        OnomaSiskevis = onomaSiskevis;
    }

    public String getTiposSiskevis() {
        return TiposSiskevis;
    }

    public void setTiposSiskevis(String tiposSiskevis) {
        TiposSiskevis = tiposSiskevis;
    }

    public double getKatanalosiEnergias() { return KatanalosiEnergias; }

    public void setKatanalosiEnergias(double KatanalosiEnergias) { KatanalosiEnergias = KatanalosiEnergias;}

    public String getTiposEstias() { return TiposEstias; }

    public void setTiposEstias(String tiposEstias) { TiposEstias = tiposEstias; }

    public String getTiposFornou() { return TiposFournou; }

    public void setTiposFornou(String tiposFornou) { TiposFournou = TiposFournou; }

    public String getHroma() { return Hroma; }

    public void setHroma(String hroma) { Hroma = hroma; }

    public boolean isPsifiakiOthoni() { return PsifiakiOthoni; }

    public void setPsifiakiOthoni(boolean psifiakiOthoni) { PsifiakiOthoni = psifiakiOthoni; }

    public double getSinolikiHoritikotita() { return SinolikiHoritikotita; }

    public void setSinolikiHoritikotita(double sinolikiHoritikotita) { SinolikiHoritikotita = sinolikiHoritikotita; }
    /* den kanei tipota (etsi zitithike apo tin askisi)
     */
    public void periodicMantainance(){
    }
    /*tiponi tis times ton vasikon haraktiristikon tis klasis
   se katalila diamorfomeno kimeno
    */
    public void VasikaHaraktiristika(){
        System.out.println("To ipsos einai:"+ipsos+"cm");
        System.out.println("To mikos einai:"+mikos+"cm");
        System.out.println("To vathos einai:"+vathos+"cm");
        System.out.println("To onoma tou kataskevasti einai:"+OnomaKataskevasti);
        System.out.println("To onoma tis siskevis einai:"+OnomaSiskevis);
        System.out.println("I energiaki klasi einai:"+TiposSiskevis);
        System.out.println("H katanalosi energias einai:"+ KatanalosiEnergias+"kWh/y");
    }
    /*tiponi tis times ton idikon haraktiristikon tis klasis
   se katalila diamorfomeno kimeno
    */
    public void IdikaHaraktiristika(){
        System.out.println("H sinoliki horitikotita einai:" +SinolikiHoritikotita+"lt");
        System.out.println("O tipos estias einai:"+TiposEstias);
        System.out.println("Psifiaki othoni:"+PsifiakiOthoni);
        System.out.println("To hroma einai:"+ Hroma);
        System.out.println("O tipos fournou einai:"+ TiposFournou);

    }


}
