public class AirCondition {
    private double ipsos, mikos, vathos, KatanalosiEnergias;
    private String OnomaKataskevasti, OnomaSiskevis, TiposSiskevis;

    private boolean WiFi, Ionistis, FiltroAera;
    private int IshiPsijis, IshiThermansis;

    /*dehete to i san timi*/
    public AirCondition(int i) {
    }
    /*dehete times gia oles tis metavlites tis klasis*/
    public AirCondition(double ipsos, double mikos, double vathos, double KatanalosiEnergias, String onomaKataskevasti, String onomaSiskevis, String tiposSiskevis, boolean wiFi, boolean ionistis, boolean filtroAera, int ishiPsijis, int ishiThermansis) {
        this.ipsos = ipsos;
        this.mikos = mikos;
        this.vathos = vathos;
        this.OnomaKataskevasti = onomaKataskevasti;
        this.OnomaSiskevis = onomaSiskevis;
        this.TiposSiskevis = tiposSiskevis;
        this.KatanalosiEnergias = KatanalosiEnergias;
        this.WiFi = wiFi;
        this.Ionistis = ionistis;
        this.FiltroAera = filtroAera;
        this.IshiPsijis = ishiPsijis;
        this.IshiThermansis = ishiThermansis;
    }
    /*dini times stis metavlites tis klasis*/
    public AirCondition(double ipsos, double mikos){
        this.ipsos = 37;
        this.mikos = 80;
        this.vathos = 30;
        this.OnomaKataskevasti = "FUJITSU";
        this.OnomaSiskevis = "FTIR25NM";
        this.TiposSiskevis = "Air Condition";
        this.KatanalosiEnergias = 558;
    }
    /*dini times stis metavlites tis klasis*/
    public AirCondition(){
        this.WiFi = true;
        this.Ionistis =true;
        this.FiltroAera = true;
        this.IshiPsijis = 32075;
        this.IshiThermansis = 34460;
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

    public double getKatanalosiEnergias() {
        return KatanalosiEnergias;
    }

    public void setKatanalosiEnergias(double katanalosiEnergias) {
        KatanalosiEnergias = katanalosiEnergias;
    }

    public boolean isWiFi() {
        return WiFi;
    }

    public void setWiFi(boolean wiFi) {
        WiFi = wiFi;
    }

    public boolean isIonistis() {
        return Ionistis;
    }

    public void setIonistis(boolean ionistis) {
        Ionistis = ionistis;
    }

    public boolean isFiltroAera() {
        return FiltroAera;
    }

    public void setFiltroAera(boolean filtroAera) {
        FiltroAera = filtroAera;
    }

    public int getIshiPsijis() {
        return IshiPsijis;
    }

    public void setIshiPsijis(int ishiPsijis) {
        IshiPsijis = ishiPsijis;
    }

    public int getIshiThermansis() {
        return IshiThermansis;
    }

    public void setIshiThermansis(int ishiThermansis) {
        IshiThermansis = ishiThermansis;
    }
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
        System.out.println("O tipos tis siskevis einai:"+TiposSiskevis);
        System.out.println("H katanalosi energias einai:"+ KatanalosiEnergias+"kWh/y");
    }
    /*tiponi tis times ton idikon haraktiristikon tis klasis
   se katalila diamorfomeno kimeno
    */
    public void IdikaHaraktiristika(){
        System.out.println("WiFi:"+WiFi);
        System.out.println("Ionistis:"+Ionistis);
        System.out.println("Filtro aera:"+FiltroAera);
        System.out.println("Ishi psijis:"+IshiPsijis+"BTU");
        System.out.println("Ishi thermansis:"+IshiThermansis+"BTU");
    }
}
