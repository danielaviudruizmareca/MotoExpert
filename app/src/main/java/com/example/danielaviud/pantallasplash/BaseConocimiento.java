package com.example.danielaviud.pantallasplash;

import Rule.*;

/**
 * Created by DANIEL AVIUD on 02/08/2018.
 */

public class BaseConocimiento {



    BooleanRuleBase basedereglas = new BooleanRuleBase("basedereglas");

    //variables de las reglas del motor
    RuleVariable Motorpierdepotencia;
    RuleVariable Motorsobrecalienta;
    RuleVariable Motorfugaaceite;
    RuleVariable Motorapagafacil;
    RuleVariable Motorhumoblanco;
    RuleVariable Motorpatadadebil;
    RuleVariable Motornoenciende;
    RuleVariable Motorvibraanormal;
    RuleVariable Motorcascabelea;
    RuleVariable Motorruidoencendido;
    RuleVariable Motordetona;


  //resultados de las reglas del motor
    RuleVariable Resultadopotencia;
    RuleVariable Resultadocalienta;
    RuleVariable Resultadofugaaceite;
    RuleVariable Resultadoapagafacil;
    RuleVariable Resultadohumoblanco;
    RuleVariable Resultadopatadadebil;
    RuleVariable Resultadonoenciende;
    RuleVariable Resultadovibraanormal;
    RuleVariable Resultadocascabelea;
    RuleVariable Resultadoruidoencendido;
    RuleVariable Resultadodetona;


    //variables de las reglas del carburador
    RuleVariable Carburadorexcesoconbustible;
    RuleVariable Carburadorinestable;
    RuleVariable Carburadorahogo;
    RuleVariable Carburadorbotaconbustible;


    //resultados de las reglas del carburador
    RuleVariable Resultadoexcesoconbustible;
    RuleVariable Resultadoinestable;
    RuleVariable Resultadoahogo;
    RuleVariable Resultadobotaconbustible;

    //variables de las reglas del Electrico
    RuleVariable Electricobajabateria;
    RuleVariable Electriconocarga;
    RuleVariable Electricoluzfarol;
    RuleVariable Electricobotonefectivo;
    RuleVariable Electricomotorenciende;
    RuleVariable Electricoguiñiadorno;
    RuleVariable Electricobocinano;
    RuleVariable Electricoluzstop;
    RuleVariable Electricoperdidaenergia;
    RuleVariable Electricofusiblequema;
    RuleVariable Electricomotoraranque;
    RuleVariable Electricolucesdelanteras;
    RuleVariable Electricofarolquemafrecuente;

    //resultados de las reglas del Electrico
    RuleVariable Resultadobajabateria;
    RuleVariable Resultadonocarga;
    RuleVariable Resultadoluzfarol;
    RuleVariable Resultadobotonefectivo;
    RuleVariable Resultadomotorenciende;
    RuleVariable Resultadoguiñiadorno;
    RuleVariable Resultadobocinano;
    RuleVariable Resultadoluzstop;
    RuleVariable Resultadoperdidaenergia;
    RuleVariable Resultadofusiblequema;
    RuleVariable Resultadomotoraranque;
    RuleVariable Resultadolucesdelanteras;
    RuleVariable Resultadofarolquemafrecuente;

    //variables de las reglas de traccion
    RuleVariable Traccioncadenatension;
    RuleVariable Traccionoxidacion;
    RuleVariable Traccioncadenasale;
    RuleVariable Traccionruidoanormal;
    RuleVariable Traccionsonidocaja;
    RuleVariable Traccionrodamientorueda;
    RuleVariable Traccionmarchacambio;

    //resultados de las reglas de traccion
    RuleVariable Resultadocadenatension;
    RuleVariable Resultadooxidacion;
    RuleVariable Resultadocadenasale;
    RuleVariable Resultadoruidoanormal;
    RuleVariable Resultadosonidocaja;
    RuleVariable Resultadorodamientorueda;
    RuleVariable Resultadomarchacambia;


    //variables de las reglas de suspension
    RuleVariable Suspensiontracerarigida;
    RuleVariable Suspensiontracerasuave;
    RuleVariable Suspensiontraceraaceite;
    RuleVariable Suspensiondelanteradura;
    RuleVariable Suspensiondelanterasuave;
    RuleVariable Suspensiondelanterafugaceite;
    RuleVariable Suspensiondelanteragolpe;
    RuleVariable Suspensionjaloneatracera;
    RuleVariable Suspensionrespondemanubrios;

    //resultados de las reglas de suspension
    RuleVariable Resultadosuspensionrigida;
    RuleVariable Resultadosuspensiontracerasuave;
    RuleVariable Resultadosuspensiontraceraaceite;
    RuleVariable Resultadosuspensiondelanteradura;
    RuleVariable Resultadosuspensiondelanterasuave;
    RuleVariable Resultadosuspensiondelanterafugaaceite;
    RuleVariable Resultadosuspensiondelanteragolpe;
    RuleVariable Resultadosuspensionjaloneatracera;
    RuleVariable Resultadosuspensionrespondemanubrios;


    //variables de las reglas de frenos
    RuleVariable Frenopegadotambor;
    RuleVariable Frenodesgasteprematuro;
    RuleVariable Frenodeficientedisco;
    RuleVariable Frenodeficientetambor;
    RuleVariable Frenoruidometalicodisco;
    RuleVariable Frenosonidosdisco;
    RuleVariable Frenosonidostambor;
    RuleVariable Frenofrenadodisco;
    RuleVariable Frenotrabadotambor;

    //resultados de las reglas de frenos
    RuleVariable Resultadofrenospegadostambor;
    RuleVariable Resultadofrenosdesgasteprematuro;
    RuleVariable Resultadofrenosdeficientedisco;
    RuleVariable Resultadofrenosdeficientetambor;
    RuleVariable Resultadofrenosruidometalicodisco;
    RuleVariable Resultadofrenossonidosdisco;
    RuleVariable Resultadofrenossonidostambor;
    RuleVariable Resultadofrenosfrenadodisco;
    RuleVariable Resultadofrenostrabadotambor;



    String resultado="";

    public String ObtenerPotencia(String valor )
    {

        //Cargamos la base de conocimiento
        basedeconocimiento();

        //pasamos valores a las variables
        Motorpierdepotencia.setValue(valor);

        //Estrategia de Busqueda
        //ENCADENAMIENTO HACIA ADELANTE
        basedereglas.forwardChain();

        resultado=Resultadopotencia.getValue();
        return resultado;
    }

    public String ObtenerCalienta(String valor)
    {
        basedeconocimiento();
        Motorsobrecalienta.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadocalienta.getValue();
        return resultado;
    }


    public String Obtenerfugaaceite(String valor)
    {
        basedeconocimiento();
        Motorfugaaceite.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofugaaceite.getValue();
        return resultado;
    }

    public String Obtenerapagafacil(String valor)
    {
        basedeconocimiento();
        Motorapagafacil.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoapagafacil.getValue();
        return resultado;
    }

    public String Obtenerhumoblanco(String valor)
    {
        basedeconocimiento();
        Motorhumoblanco.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadohumoblanco.getValue();
        return resultado;
    }

    public String Obtenerpatadadebil(String valor)
    {
        basedeconocimiento();
        Motorpatadadebil.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadopatadadebil.getValue();
        return resultado;
    }

    public String Obtenernoenciende(String valor)
    {
        basedeconocimiento();
        Motornoenciende.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadonoenciende.getValue();
        return resultado;
    }

    public String Obtenervibraanormal(String valor)
    {
        basedeconocimiento();
        Motorvibraanormal.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadovibraanormal.getValue();
        return resultado;
    }

    public String Obtenercascabelea(String valor)
    {
        basedeconocimiento();
        Motorcascabelea.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadocascabelea.getValue();
        return resultado;
    }

    public String Obtenerruidoencendido(String valor)
    {
        basedeconocimiento();
        Motorruidoencendido.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoruidoencendido.getValue();
        return resultado;
    }

    public String Obtenerdetona(String valor)
    {
        basedeconocimiento();
        Motordetona.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadodetona.getValue();
        return resultado;
    }

    public String ObtenerExcesoconbustible(String valor )
    {

        //Cargamos la base de conocimiento
        basedeconocimiento();

        //pasamos valores a las variables
        Carburadorexcesoconbustible.setValue(valor);

        //Estrategia de Busqueda
        //ENCADENAMIENTO HACIA ADELANTE
        basedereglas.forwardChain();

        resultado=Resultadoexcesoconbustible.getValue();
        return resultado;
    }

    public String Obtenerinestable(String valor )
    {
        basedeconocimiento();
        Carburadorinestable.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoinestable.getValue();
        return resultado;
    }

    public String Obtenerahogo(String valor )
    {
        basedeconocimiento();
        Carburadorahogo.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoahogo.getValue();
        return resultado;
    }

    public String Obtenerbotacombustible(String valor )
    {
        basedeconocimiento();
        Carburadorbotaconbustible.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadobotaconbustible.getValue();
        return resultado;
    }

    public String Obtenerbajabateria(String valor )
    {
        basedeconocimiento();
        Electricobajabateria.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadobajabateria.getValue();
        return resultado;
    }

    public String Obtenernocarga(String valor )
    {
        basedeconocimiento();
        Electriconocarga.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadonocarga.getValue();
        return resultado;
    }

    public String Obtenerluzfarol(String valor )
    {
        basedeconocimiento();
        Electricoluzfarol.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoluzfarol.getValue();
        return resultado;
    }

    public String Obtenerbotonefectivo(String valor )
    {
        basedeconocimiento();
        Electricobotonefectivo.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadobotonefectivo.getValue();
        return resultado;
    }

    public String Obtenermotorenciende(String valor )
    {
        basedeconocimiento();
        Electricomotorenciende.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadomotorenciende.getValue();
        return resultado;
    }


    public String Obtenerguiñiadorno(String valor )
    {
        basedeconocimiento();
        Electricoguiñiadorno.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoguiñiadorno.getValue();
        return resultado;
    }

    public String Obtenerbocinano(String valor )
    {
        basedeconocimiento();
        Electricobocinano.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadobocinano.getValue();
        return resultado;
    }

    public String Obtenerluzstop(String valor )
    {
        basedeconocimiento();
        Electricoluzstop.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoluzstop.getValue();
        return resultado;
    }

    public String Obtenerperdidaenergia(String valor )
    {
        basedeconocimiento();
        Electricoperdidaenergia.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoperdidaenergia.getValue();
        return resultado;
    }

    public String Obtenerfusiblequema(String valor )
    {
        basedeconocimiento();
        Electricofusiblequema.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofusiblequema.getValue();
        return resultado;
    }

    public String Obtenermotoraranque(String valor )
    {
        basedeconocimiento();
        Electricomotoraranque.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadomotoraranque.getValue();
        return resultado;
    }

    public String Obtenerlucesdelanteras(String valor )
    {
        basedeconocimiento();
        Electricolucesdelanteras.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadolucesdelanteras.getValue();
        return resultado;
    }

    public String Obtenerfarolquemafrecuente(String valor )
    {
        basedeconocimiento();
        Electricofarolquemafrecuente.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofarolquemafrecuente.getValue();
        return resultado;
    }

    public String Obtenercadenatension(String valor )
    {
        basedeconocimiento();
        Traccioncadenatension.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadocadenatension.getValue();
        return resultado;
    }

    public String Obteneroxidacion(String valor )
    {
        basedeconocimiento();
        Traccionoxidacion.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadooxidacion.getValue();
        return resultado;
    }

    public String Obtenercadenasale(String valor )
    {
        basedeconocimiento();
        Traccioncadenasale.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadocadenasale.getValue();
        return resultado;
    }


    public String Obtenerruidoanormal(String valor )
    {
        basedeconocimiento();
        Traccionruidoanormal.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadoruidoanormal.getValue();
        return resultado;
    }

    public String Obtenersonidocaja(String valor )
    {
        basedeconocimiento();
        Traccionsonidocaja.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosonidocaja.getValue();
        return resultado;
    }

    public String Obtenerrodamientorueda(String valor )
    {
        basedeconocimiento();
        Traccionrodamientorueda.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadorodamientorueda.getValue();
        return resultado;
    }

    public String Obtenermarchacambio(String valor )
    {
        basedeconocimiento();
        Traccionmarchacambio.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadomarchacambia.getValue();
        return resultado;
    }

    public String Obtenersuspensiontracerarigida(String valor )
    {
        basedeconocimiento();
        Suspensiontracerarigida.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensionrigida.getValue();
        return resultado;
    }

    public String Obtenersuspensiontracerasuave(String valor )
    {
        basedeconocimiento();
        Suspensiontracerasuave.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensiontracerasuave.getValue();
        return resultado;
    }

    public String Obtenersuspensiontraceraaceite(String valor )
    {
        basedeconocimiento();
        Suspensiontraceraaceite.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensiontraceraaceite.getValue();
        return resultado;
    }

    public String Obtenersuspensiondelanteradura(String valor )
    {
        basedeconocimiento();
        Suspensiondelanteradura.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensiondelanteradura.getValue();
        return resultado;
    }

    public String Obtenersuspensiondelanterasuave(String valor )
    {
        basedeconocimiento();
        Suspensiondelanterasuave.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensiondelanterasuave.getValue();
        return resultado;
    }

    public String Obtenersuspensiondelanterafugaaceite(String valor )
    {
        basedeconocimiento();
        Suspensiondelanterafugaceite.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensiondelanterafugaaceite.getValue();
        return resultado;
    }

    public String Obtenersuspensiondelanteragolpe(String valor )
    {
        basedeconocimiento();
        Suspensiondelanteragolpe.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensiondelanteragolpe.getValue();
        return resultado;
    }

    public String Obtenersuspensionjaloneatracera(String valor )
    {
        basedeconocimiento();
        Suspensionjaloneatracera.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensionjaloneatracera.getValue();
        return resultado;
    }

    public String Obtenersuspensionrespondemanubrios(String valor )
    {
        basedeconocimiento();
        Suspensionrespondemanubrios.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadosuspensionrespondemanubrios.getValue();
        return resultado;
    }

    public String Obtenerfrenospegadostambor(String valor )
    {
        basedeconocimiento();
        Frenopegadotambor.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenospegadostambor.getValue();
        return resultado;
    }

    public String Obtenerfrenosdesgasteprematuro(String valor )
    {
        basedeconocimiento();
        Frenodesgasteprematuro.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenosdesgasteprematuro.getValue();
        return resultado;
    }

    public String Obtenerfrenosdeficientedisco(String valor )
    {
        basedeconocimiento();
        Frenodeficientedisco.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenosdeficientedisco.getValue();
        return resultado;
    }

    public String Obtenerfrenosdeficientetambor(String valor )
    {
        basedeconocimiento();
        Frenodeficientetambor.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenosdeficientetambor.getValue();
        return resultado;
    }

    public String Obtenerfrenosruidometalicodisco(String valor )
    {
        basedeconocimiento();
        Frenoruidometalicodisco.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenosruidometalicodisco.getValue();
        return resultado;
    }

    public String Obtenerfrenossonidosdisco(String valor )
    {
        basedeconocimiento();
        Frenosonidosdisco.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenossonidosdisco.getValue();
        return resultado;
    }

    public String Obtenerfrenossonidostambor(String valor )
    {
        basedeconocimiento();
        Frenosonidostambor.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenossonidostambor.getValue();
        return resultado;
    }

    public String Obtenerfrenosfrenadodisco(String valor )
    {
        basedeconocimiento();
        Frenofrenadodisco.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenosfrenadodisco.getValue();
        return resultado;
    }

    public String Obtenerfrenostrabadotambor(String valor )
    {
        basedeconocimiento();
        Frenotrabadotambor.setValue(valor);

        basedereglas.forwardChain();

        resultado=Resultadofrenostrabadotambor.getValue();
        return resultado;
    }










    public void basedeconocimiento() {


        //inicializa las variables de motor
        Motorpierdepotencia = new RuleVariable(basedereglas, "");
        Motorsobrecalienta = new RuleVariable(basedereglas, "");
        Motorfugaaceite = new RuleVariable(basedereglas, "");
        Motorapagafacil = new RuleVariable(basedereglas, "");
        Motorhumoblanco = new RuleVariable(basedereglas, "");
        Motorpatadadebil = new RuleVariable(basedereglas, "");
        Motornoenciende = new RuleVariable(basedereglas, "");
        Motorvibraanormal = new RuleVariable(basedereglas, "");
        Motorcascabelea = new RuleVariable(basedereglas, "");
        Motorruidoencendido = new RuleVariable(basedereglas, "");
        Motordetona = new RuleVariable(basedereglas, "");


        //se inicializa los resultados del motor
        Resultadopotencia = new RuleVariable(basedereglas, "");
        Resultadocalienta = new RuleVariable(basedereglas, "");
        Resultadofugaaceite = new RuleVariable(basedereglas, "");
        Resultadoapagafacil = new RuleVariable(basedereglas, "");
        Resultadohumoblanco = new RuleVariable(basedereglas, "");
        Resultadopatadadebil = new RuleVariable(basedereglas, "");
        Resultadonoenciende = new RuleVariable(basedereglas, "");
        Resultadovibraanormal = new RuleVariable(basedereglas, "");
        Resultadocascabelea = new RuleVariable(basedereglas, "");
        Resultadoruidoencendido = new RuleVariable(basedereglas, "");
        Resultadodetona = new RuleVariable(basedereglas, "");

        //inicializa las variables del carburador
        Carburadorexcesoconbustible = new RuleVariable(basedereglas, "");
        Carburadorinestable = new RuleVariable(basedereglas, "");
        Carburadorahogo = new RuleVariable(basedereglas, "");
        Carburadorbotaconbustible = new RuleVariable(basedereglas, "");

        //se inicializa los resultados del carburador
        Resultadoexcesoconbustible = new RuleVariable(basedereglas, "");
        Resultadoinestable = new RuleVariable(basedereglas, "");
        Resultadoahogo = new RuleVariable(basedereglas, "");
        Resultadobotaconbustible = new RuleVariable(basedereglas, "");

        //inicializa las variables del Electrico
        Electricobajabateria = new RuleVariable(basedereglas, "");
        Electriconocarga = new RuleVariable(basedereglas, "");
        Electricoluzfarol = new RuleVariable(basedereglas, "");
        Electricobotonefectivo = new RuleVariable(basedereglas, "");
        Electricomotorenciende = new RuleVariable(basedereglas, "");
        Electricoguiñiadorno = new RuleVariable(basedereglas, "");
        Electricobocinano = new RuleVariable(basedereglas, "");
        Electricoluzstop = new RuleVariable(basedereglas, "");
        Electricoperdidaenergia = new RuleVariable(basedereglas, "");
        Electricofusiblequema = new RuleVariable(basedereglas, "");
        Electricomotoraranque = new RuleVariable(basedereglas, "");
        Electricolucesdelanteras = new RuleVariable(basedereglas, "");
        Electricofarolquemafrecuente = new RuleVariable(basedereglas, "");

        //se inicializa los resultados del Electrico
        Resultadobajabateria = new RuleVariable(basedereglas, "");
        Resultadonocarga = new RuleVariable(basedereglas, "");
        Resultadoluzfarol = new RuleVariable(basedereglas, "");
        Resultadobotonefectivo = new RuleVariable(basedereglas, "");
        Resultadomotorenciende = new RuleVariable(basedereglas, "");
        Resultadoguiñiadorno = new RuleVariable(basedereglas, "");
        Resultadobocinano = new RuleVariable(basedereglas, "");
        Resultadoluzstop = new RuleVariable(basedereglas, "");
        Resultadoperdidaenergia = new RuleVariable(basedereglas, "");
        Resultadofusiblequema = new RuleVariable(basedereglas, "");
        Resultadomotoraranque = new RuleVariable(basedereglas, "");
        Resultadolucesdelanteras = new RuleVariable(basedereglas, "");
        Resultadofarolquemafrecuente = new RuleVariable(basedereglas, "");

        //inicializa las variables de traccion
        Traccioncadenatension = new RuleVariable(basedereglas, "");
        Traccionoxidacion = new RuleVariable(basedereglas, "");
        Traccioncadenasale = new RuleVariable(basedereglas, "");
        Traccionruidoanormal = new RuleVariable(basedereglas, "");
        Traccionsonidocaja = new RuleVariable(basedereglas, "");
        Traccionrodamientorueda = new RuleVariable(basedereglas, "");
        Traccionmarchacambio = new RuleVariable(basedereglas, "");

        //se inicializa los resultados de traccion
        Resultadocadenatension = new RuleVariable(basedereglas, "");
        Resultadooxidacion = new RuleVariable(basedereglas, "");
        Resultadocadenasale = new RuleVariable(basedereglas, "");
        Resultadoruidoanormal = new RuleVariable(basedereglas, "");
        Resultadosonidocaja = new RuleVariable(basedereglas, "");
        Resultadorodamientorueda = new RuleVariable(basedereglas, "");
        Resultadomarchacambia = new RuleVariable(basedereglas, "");

        //inicializa las variables de suspension
        Suspensiontracerarigida = new RuleVariable(basedereglas, "");
        Suspensiontracerasuave = new RuleVariable(basedereglas, "");
        Suspensiontraceraaceite = new RuleVariable(basedereglas, "");
        Suspensiondelanteradura = new RuleVariable(basedereglas, "");
        Suspensiondelanterasuave = new RuleVariable(basedereglas, "");
        Suspensiondelanterafugaceite = new RuleVariable(basedereglas, "");
        Suspensiondelanteragolpe = new RuleVariable(basedereglas, "");
        Suspensionjaloneatracera = new RuleVariable(basedereglas, "");
        Suspensionrespondemanubrios = new RuleVariable(basedereglas, "");

        //se inicializa los resultados de suspension
        Resultadosuspensionrigida = new RuleVariable(basedereglas, "");
        Resultadosuspensiontracerasuave = new RuleVariable(basedereglas, "");
        Resultadosuspensiontraceraaceite = new RuleVariable(basedereglas, "");
        Resultadosuspensiondelanteradura = new RuleVariable(basedereglas, "");
        Resultadosuspensiondelanterasuave = new RuleVariable(basedereglas, "");
        Resultadosuspensiondelanterafugaaceite = new RuleVariable(basedereglas, "");
        Resultadosuspensiondelanteragolpe = new RuleVariable(basedereglas, "");
        Resultadosuspensionjaloneatracera = new RuleVariable(basedereglas, "");
        Resultadosuspensionrespondemanubrios = new RuleVariable(basedereglas, "");


        //inicializa las variables de freno
        Frenopegadotambor = new RuleVariable(basedereglas, "");
        Frenodesgasteprematuro = new RuleVariable(basedereglas, "");
        Frenodeficientedisco = new RuleVariable(basedereglas, "");
        Frenodeficientetambor = new RuleVariable(basedereglas, "");
        Frenoruidometalicodisco = new RuleVariable(basedereglas, "");
        Frenosonidosdisco = new RuleVariable(basedereglas, "");
        Frenosonidostambor = new RuleVariable(basedereglas, "");
        Frenofrenadodisco = new RuleVariable(basedereglas, "");
        Frenotrabadotambor = new RuleVariable(basedereglas, "");


        //se inicializa los resultados de frenos
        Resultadofrenospegadostambor = new RuleVariable(basedereglas, "");
        Resultadofrenosdesgasteprematuro = new RuleVariable(basedereglas, "");
        Resultadofrenosdeficientedisco = new RuleVariable(basedereglas, "");
        Resultadofrenosdeficientetambor = new RuleVariable(basedereglas, "");
        Resultadofrenosruidometalicodisco = new RuleVariable(basedereglas, "");
        Resultadofrenossonidosdisco = new RuleVariable(basedereglas, "");
        Resultadofrenossonidostambor = new RuleVariable(basedereglas, "");
        Resultadofrenosfrenadodisco = new RuleVariable(basedereglas, "");
        Resultadofrenostrabadotambor = new RuleVariable(basedereglas, "");




        Condition igual = new Condition("=");


        new Rule(basedereglas,"reglauno",
                new Clause[]{
                        new Clause(Motorpierdepotencia,igual,"si")
                },
                new Clause(Resultadopotencia,igual," -Calibre de balancines inadecuado\n -Cantidad excesiva de aceite en el motor\n -Filtro de aire obstruido\n -Disco de embriagues desgastados")
        );


        new Rule(basedereglas,"reglados",
                new Clause[]{
                        new Clause(Motorpierdepotencia,igual,"no")
                },
                new Clause(Resultadopotencia,igual,"¿EL Motor se Sobrecalienta?")
        );


        new Rule(basedereglas,"reglatres",
                new Clause[]{
                        new Clause(Motorsobrecalienta,igual,"si")
                },
                new Clause(Resultadocalienta,igual," -Uso de aceite inadecuado\n -Bajo nivel de aceite\n -Entrada de aire adicional\n -Mal ajuste en la válvula de admisión\n -Filtro de aceite tapado")
        );


        new Rule(basedereglas,"reglacuatro",
                new Clause[]{
                        new Clause(Motorsobrecalienta,igual,"no")
                },
                new Clause(Resultadocalienta,igual,"¿El motor presenta fugas de aceite?")
        );


        new Rule(basedereglas,"reglacinco",
                new Clause[]{
                        new Clause(Motorfugaaceite,igual,"si")
                },
                new Clause(Resultadofugaaceite,igual," -Retenes dañados\n -Fractura en el Carter\n -Ruptura en los empaques")
        );

        new Rule(basedereglas,"reglaseis",
                new Clause[]{
                        new Clause(Motorfugaaceite,igual,"no")
                },
                new Clause(Resultadofugaaceite,igual,"¿El motor se apaga con facilidad?")
        );

        new Rule(basedereglas,"reglasiete",
                new Clause[]{
                        new Clause(Motorapagafacil,igual,"si")
                },
                new Clause(Resultadoapagafacil,igual," -Carburador mal sincronizado\n -Bobinas de encendido en corte o conexión floja\n -Cordón de alta tensión mal aislado (pelado)\n -Bujía sucia o electrodo gastado\n -CDI en corte o conexión floja\n -Filtro de gasolina sucio")
        );

        new Rule(basedereglas,"reglaocho",
                new Clause[]{
                        new Clause(Motorapagafacil,igual,"no")
                },
                new Clause(Resultadoapagafacil,igual,"¿El motor expulsa humo blanco por el escape?")
        );

        new Rule(basedereglas,"reglanueve",
                new Clause[]{
                        new Clause(Motorhumoblanco,igual,"si")
                },
                new Clause(Resultadohumoblanco,igual," -Válvula de admisión o de escape defectuosas\n -Retenes de válvulas dañados\n -Anillos del pistón gastados\n -Cilindro gastado\n -Empaque de culata gastado")
        );

        new Rule(basedereglas,"regladiez",
                new Clause[]{
                        new Clause(Motorhumoblanco,igual,"no")
                },
                new Clause(Resultadohumoblanco,igual,"¿El motor tiene la patada débil?")
        );

        new Rule(basedereglas,"reglaonce",
                new Clause[]{
                        new Clause(Motorpatadadebil,igual,"si")
                },
                new Clause(Resultadopatadadebil,igual," -Válvulas mal asentadas\n -Guías de válvulas gastados\n -Resorte de válvulas débil o roto\n -Cilindro o anillos del pistón desgastados\n -Falta de lubricación")
        );

        new Rule(basedereglas,"regladoce",
                new Clause[]{
                        new Clause(Motorpatadadebil,igual,"no")
                },
                new Clause(Resultadopatadadebil,igual,"¿El motor no enciende?")
        );


        new Rule(basedereglas,"regla13",
                new Clause[]{
                        new Clause(Motornoenciende,igual,"si")
                },
                new Clause(Resultadonoenciende,igual," -Tanque de combustible vacío\n -filtro de gasolina bloqueado\n -Bobinas de encendidos quemadas\n -CDI defectuoso o quemado\n -Bujía defectuosa\n -Cordón de alta tensión desconectado\n -Perdida de compresión")
        );


        new Rule(basedereglas,"regla14",
                new Clause[]{
                        new Clause(Motornoenciende,igual,"no")
                },
                new Clause(Resultadonoenciende,igual,"¿EL Motor tiene Vibraciones anormal?")
        );

        new Rule(basedereglas,"regla15",
                new Clause[]{
                        new Clause(Motorvibraanormal,igual,"si")
                },
                new Clause(Resultadovibraanormal,igual," -Tornillos que sostienen el motor flojos\n -Mala alineación del piñón")
        );

        new Rule(basedereglas,"regla16",
                new Clause[]{
                        new Clause(Motorvibraanormal,igual,"no")
                },
                new Clause(Resultadovibraanormal,igual,"¿Cascabeleo anormal dentro del motor?")
        );

        new Rule(basedereglas,"regla17",
                new Clause[]{
                        new Clause(Motorcascabelea,igual,"si")
                },
                new Clause(Resultadocascabelea,igual," -Árbol de elevas defectuoso\n -Biela defectuosa\n -Cilindro gastado\n -Contratuerca de la bomba de aceite floja")
        );

        new Rule(basedereglas,"regla18",
                new Clause[]{
                        new Clause(Motorcascabelea,igual,"no")
                },
                new Clause(Resultadocascabelea,igual,"¿Ruidos anormal en el momento de encendido con el botón de arranque?")
        );

        new Rule(basedereglas,"regla19",
                new Clause[]{
                        new Clause(Motorruidoencendido,igual,"si")
                },
                new Clause(Resultadoruidoencendido,igual," -Cremallera del arranque defectuosa\n -Rodillos o canastilla de la cremallera defectuosos\n -Motor de arranque defectuoso\n -Cadenilla del motor de arranque defectuosa")
        );

        new Rule(basedereglas,"regla20",
                new Clause[]{
                        new Clause(Motorruidoencendido,igual,"no")
                },
                new Clause(Resultadoruidoencendido,igual,"¿El motor detona periódicamente?")
        );

        new Rule(basedereglas,"regla21",
                new Clause[]{
                        new Clause(Motordetona,igual,"si")
                },
                new Clause(Resultadodetona,igual," -Bujía opera demasiado caliente\n -Bujía defectuosa")
        );

        new Rule(basedereglas,"regla22",
                new Clause[]{
                        new Clause(Carburadorexcesoconbustible,igual,"si")
                },
                new Clause(Resultadoexcesoconbustible,igual," -Fugas de gasolina\n -Estrangulador abierto\n -Mala calibración del carburador")
        );

        new Rule(basedereglas,"regla23",
                new Clause[]{
                        new Clause(Carburadorexcesoconbustible,igual,"no")
                },
                new Clause(Resultadoexcesoconbustible,igual,"¿Presenta aceleración inestable?")
        );

        new Rule(basedereglas,"regla24",
                new Clause[]{
                        new Clause(Carburadorinestable,igual,"si")
                },
                new Clause(Resultadoinestable,igual," -Mala calibración de balancines\n -Perdida de compresión\n -Acumulación de agua en el combustible\n -Retorno del control del acelerador lento")
        );

        new Rule(basedereglas,"regla25",
                new Clause[]{
                        new Clause(Carburadorinestable,igual,"no")
                },
                new Clause(Resultadoinestable,igual,"¿Ahogo al acelerar?")
        );

        new Rule(basedereglas,"regla26",
                new Clause[]{
                        new Clause(Carburadorahogo,igual,"si")
                },
                new Clause(Resultadoahogo,igual," -Seguro de la aguja del pistón del carburador fuera de posición\n -Acumulación de agua en el carburador\n -Filtro de aire obstruido\n -Gargantilla rota")
        );

        new Rule(basedereglas,"regla27",
                new Clause[]{
                        new Clause(Carburadorahogo,igual,"no")
                },
                new Clause(Resultadoahogo,igual,"¿El carburador bota combustible?")
        );

        new Rule(basedereglas,"regla28",
                new Clause[]{
                        new Clause(Carburadorbotaconbustible,igual,"si")
                },
                new Clause(Resultadobotaconbustible,igual," -Aguja del flotador defectuosa\n -Flotador agujereado\n -Tasa del carburador rota\n -Carburador sucio")
        );

        new Rule(basedereglas,"regla29",
                new Clause[]{
                        new Clause(Electricobajabateria,igual,"si")
                },
                new Clause(Resultadobajabateria,igual," -Estator de bobinas en corto interno\n -Collar de bobinas en corte\n -Batería en mal estado")
        );

        new Rule(basedereglas,"regla30",
                new Clause[]{
                        new Clause(Electricobajabateria,igual,"no")
                },
                new Clause(Resultadobajabateria,igual,"¿La batería no carga?")
        );

        new Rule(basedereglas,"regla31",
                new Clause[]{
                        new Clause(Electriconocarga,igual,"si")
                },
                new Clause(Resultadonocarga,igual," -Rectificador de corriente defectuoso\n -Conexiones de bornes sulfatados\n -Bobinas de luz quemadas\n -Batería en mal estado")
        );

        new Rule(basedereglas,"regla32",
                new Clause[]{
                        new Clause(Electriconocarga,igual,"no")
                },
                new Clause(Resultadonocarga,igual,"¿La luz del farol no enciende?")
        );

        new Rule(basedereglas,"regla33",
                new Clause[]{
                        new Clause(Electricoluzfarol,igual,"si")
                },
                new Clause(Resultadoluzfarol,igual," -Bombillo quemado\n -Mal contacto del bombillo\n -Socket defectuoso\n -Interruptor de luz defectuoso\n -Cable de tierra desconectado")
        );

        new Rule(basedereglas,"regla34",
                new Clause[]{
                        new Clause(Electricoluzfarol,igual,"no")
                },
                new Clause(Resultadoluzfarol,igual,"¿El botón de arranque no es efectivo?")
        );

        new Rule(basedereglas,"regla35",
                new Clause[]{
                        new Clause(Electricobotonefectivo,igual,"si")
                },
                new Clause(Resultadobotonefectivo,igual," -Batería descargada\n -Contactos del botón sulfatados\n -Relé de arranque defectuoso\n -Motor de arranque en mal estado")
        );

        new Rule(basedereglas,"regla36",
                new Clause[]{
                        new Clause(Electricobotonefectivo,igual,"no")
                },
                new Clause(Resultadobotonefectivo,igual,"¿El motor es costoso de encender o no enciende?")
        );

        new Rule(basedereglas,"regla37",
                new Clause[]{
                        new Clause(Electricomotorenciende,igual,"si")
                },
                new Clause(Resultadomotorenciende,igual," -La bujía no produce chispa\n -Bobina impulsora defectuosa\n -Interruptor de bloqueo en corte\n -Chapa de contacto defectuosa\n -CDI en corte")
        );

        new Rule(basedereglas,"regla38",
                new Clause[]{
                        new Clause(Electricomotorenciende,igual,"no")
                },
                new Clause(Resultadomotorenciende,igual,"¿Los guiñadores no encienden?")
        );

        new Rule(basedereglas,"regla39",
                new Clause[]{
                        new Clause(Electricoguiñiadorno,igual,"si")
                },
                new Clause(Resultadoguiñiadorno,igual," -Intermitente defectuoso\n -Interruptor defectuoso\n -Bombillos quemados")
        );

        new Rule(basedereglas,"regla40",
                new Clause[]{
                        new Clause(Electricoguiñiadorno,igual,"no")
                },
                new Clause(Resultadoguiñiadorno,igual,"¿La bocina no es efectiva?")
        );

        new Rule(basedereglas,"regla41",
                new Clause[]{
                        new Clause(Electricobocinano,igual,"si")
                },
                new Clause(Resultadobocinano,igual," -Bocina mal regulada\n -Conexiones flojas\n -Botón sulfatado")
        );

        new Rule(basedereglas,"regla42",
                new Clause[]{
                        new Clause(Electricobocinano,igual,"no")
                },
                new Clause(Resultadobocinano,igual,"¿Luz de stop (trasera) no enciende?")
        );

        new Rule(basedereglas,"regla43",
                new Clause[]{
                        new Clause(Electricoluzstop,igual,"si")
                },
                new Clause(Resultadoluzstop,igual," -Bombillo quemado\n -Socket con sarro\n -Suite de freno defectuoso")
        );

        new Rule(basedereglas,"regla44",
                new Clause[]{
                        new Clause(Electricoluzstop,igual,"no")
                },
                new Clause(Resultadoluzstop,igual,"¿Pérdida total de energía?")
        );

        new Rule(basedereglas,"regla45",
                new Clause[]{
                        new Clause(Electricoperdidaenergia,igual,"si")
                },
                new Clause(Resultadoperdidaenergia,igual," -Fusible quemado\n -Batería desconectada\n -Bornes de la batería sulfatados")
        );

        new Rule(basedereglas,"regla46",
                new Clause[]{
                        new Clause(Electricoperdidaenergia,igual,"no")
                },
                new Clause(Resultadoperdidaenergia,igual,"¿El Fusible se quema con frecuencia?")
        );

        new Rule(basedereglas,"regla47",
                new Clause[]{
                        new Clause(Electricofusiblequema,igual,"si")
                },
                new Clause(Resultadofusiblequema,igual," -Cable positivo hace contacto con tierra\n -Algún componente eléctrico en corte")
        );

        new Rule(basedereglas,"regla48",
                new Clause[]{
                        new Clause(Electricofusiblequema,igual,"no")
                },
                new Clause(Resultadofusiblequema,igual,"¿El motor de arranque no gira al presionar el botón?")
        );

        new Rule(basedereglas,"regla49",
                new Clause[]{
                        new Clause(Electricomotoraranque,igual,"si")
                },
                new Clause(Resultadomotoraranque,igual," -Batería en mal estado\n -Terminales pobremente conectados\n -Los Carbones de arranque en mal estado\n -Circuito de bobina del motor de arranque en corte")
        );

        new Rule(basedereglas,"regla50",
                new Clause[]{
                        new Clause(Electricomotoraranque,igual,"no")
                },
                new Clause(Resultadomotoraranque,igual,"¿Las luces delanteras principales se reducen apreciablemente o están débiles?")
        );

        new Rule(basedereglas,"regla51",
                new Clause[]{
                        new Clause(Electricolucesdelanteras,igual,"si")
                },
                new Clause(Resultadolucesdelanteras,igual," -Batería dañada\n -Bombillos en mal estado\n -Motor de arranque defectuoso\n -Rectificador de corriente en corte")
        );

        new Rule(basedereglas,"regla52",
                new Clause[]{
                        new Clause(Electricolucesdelanteras,igual,"no")
                },
                new Clause(Resultadolucesdelanteras,igual,"¿La luz del farol se quema frecuentemente?")
        );

        new Rule(basedereglas,"regla53",
                new Clause[]{
                        new Clause(Electricofarolquemafrecuente,igual,"si")
                },
                new Clause(Resultadofarolquemafrecuente,igual," -El rectificador de corriente en mal estado\n -Corte en el sistema eléctrico")
        );

        new Rule(basedereglas,"regla54",
                new Clause[]{
                        new Clause(Traccioncadenatension,igual,"si")
                },
                new Clause(Resultadocadenatension,igual," -Exceso de lubricación\n -Desgaste excesivo del kit de transmisión\n -Eje de la rueda flojo\n -Suciedad en el kit de transmisión")
        );

        new Rule(basedereglas,"regla55",
                new Clause[]{
                        new Clause(Traccioncadenatension,igual,"no")
                },
                new Clause(Resultadocadenatension,igual,"¿Oxidación de la cadena?")
        );

        new Rule(basedereglas,"regla56",
                new Clause[]{
                        new Clause(Traccionoxidacion,igual,"si")
                },
                new Clause(Resultadooxidacion,igual," -Falta de lubricación\n -Derrame del ácido de batería")
        );

        new Rule(basedereglas,"regla57",
                new Clause[]{
                        new Clause(Traccionoxidacion,igual,"no")
                },
                new Clause(Resultadooxidacion,igual,"¿La cadena se sale de su lugar constantemente?")
        );

        new Rule(basedereglas,"regla58",
                new Clause[]{
                        new Clause(Traccioncadenasale,igual,"si")
                },
                new Clause(Resultadocadenasale,igual," -Mala alineación del piñón con la catalina\n -Demasiada holgura\n -Cadena torcida\n -Rodamiento de catalina dañado")
        );

        new Rule(basedereglas,"regla59",
                new Clause[]{
                        new Clause(Traccioncadenasale,igual,"no")
                },
                new Clause(Resultadocadenasale,igual,"¿Ruidos anormales en el motor?")
        );

        new Rule(basedereglas,"regla60",
                new Clause[]{
                        new Clause(Traccionruidoanormal,igual,"si")
                },
                new Clause(Resultadoruidoanormal,igual," -Piñon en mal estado\n -Perdida de tensión de la Cadenilla\n -Tezador de cadenilla defectuoso")
        );

        new Rule(basedereglas,"regla61",
                new Clause[]{
                        new Clause(Traccionruidoanormal,igual,"no")
                },
                new Clause(Resultadoruidoanormal,igual,"¿Sonido al dar la caja de cambios?")
        );

        new Rule(basedereglas,"regla62",
                new Clause[]{
                        new Clause(Traccionsonidocaja,igual,"si")
                },
                new Clause(Resultadosonidocaja,igual," -Rodamiento de prensa dañado\n -Piñón degastado\n -Engranajes de la caja dañados\n -Goma de tracción degastada")
        );

        new Rule(basedereglas,"regla63",
                new Clause[]{
                        new Clause(Traccionsonidocaja,igual,"no")
                },
                new Clause(Resultadosonidocaja,igual,"¿Ruidos o movimientos anormales de las ruedas?")
        );

        new Rule(basedereglas,"regla64",
                new Clause[]{
                        new Clause(Traccionrodamientorueda,igual,"si")
                },
                new Clause(Resultadorodamientorueda,igual," -Desgaste o rotura de rodamientos\n -Radios flojos o rotos\n -Ejes de las ruedas flojos o desgastados\n -Macero desgastado")
        );

        new Rule(basedereglas,"regla65",
                new Clause[]{
                        new Clause(Traccionrodamientorueda,igual,"no")
                },
                new Clause(Resultadorodamientorueda,igual,"¿Al dar caja de cambios no da marcha la motocicleta?")
        );

        new Rule(basedereglas,"regla66",
                new Clause[]{
                        new Clause(Traccionmarchacambio,igual,"si")
                },
                new Clause(Resultadomarchacambia,igual," -Eje de piñón redondeado\n -Disco de embriague desgastado")
        );

        new Rule(basedereglas,"regla67",
                new Clause[]{
                        new Clause(Suspensiontracerarigida,igual,"si")
                },
                new Clause(Resultadosuspensionrigida,igual," -Ajuste incorrecto de la graduación del amortiguador\n -Eje de amortiguador doblado\n -Desgaste de los bujes del brazo oscilante")
        );

        new Rule(basedereglas,"regla68",
                new Clause[]{
                        new Clause(Suspensiontracerarigida,igual,"no")
                },
                new Clause(Resultadosuspensionrigida,igual,"¿Suspensión trasera demasiado suave?")
        );

        new Rule(basedereglas,"regla69",
                new Clause[]{
                        new Clause(Suspensiontracerasuave,igual,"si")
                },
                new Clause(Resultadosuspensiontracerasuave,igual," -Ajuste incorrecto del punto de graduación\n -Fugas de aceite\n -Resorte débil")
        );

        new Rule(basedereglas,"regla70",
                new Clause[]{
                        new Clause(Suspensiontracerasuave,igual,"no")
                },
                new Clause(Resultadosuspensiontracerasuave,igual,"¿El amortiguador trasero tiene fugas de aceite?")
        );

        new Rule(basedereglas,"regla71",
                new Clause[]{
                        new Clause(Suspensiontraceraaceite,igual,"si")
                },
                new Clause(Resultadosuspensiontraceraaceite,igual," -Retenes dañados")
        );

        new Rule(basedereglas,"regla72",
                new Clause[]{
                        new Clause(Suspensiontraceraaceite,igual,"no")
                },
                new Clause(Resultadosuspensiontraceraaceite,igual,"¿Suspensión delantera demasiado dura?")
        );

        new Rule(basedereglas,"regla73",
                new Clause[]{
                        new Clause(Suspensiondelanteradura,igual,"si")
                },
                new Clause(Resultadosuspensiondelanteradura,igual," -Uso de aceite inadecuado\n -Exceso de aceite\n -Telescopio descentrado")
        );

        new Rule(basedereglas,"regla74",
                new Clause[]{
                        new Clause(Suspensiondelanteradura,igual,"no")
                },
                new Clause(Resultadosuspensiondelanteradura,igual,"¿Suspensión delantera demasiado suave?")
        );

        new Rule(basedereglas,"regla75",
                new Clause[]{
                        new Clause(Suspensiondelanterasuave,igual,"si")
                },
                new Clause(Resultadosuspensiondelanterasuave,igual," -Resortes débiles\n -Falta de aceite\n -Suspensión trasera demasiada alta")
        );

        new Rule(basedereglas,"regla76",
                new Clause[]{
                        new Clause(Suspensiondelanterasuave,igual,"no")
                },
                new Clause(Resultadosuspensiondelanterasuave,igual,"¿La suspensión delantera presenta fugas de aceite?")
        );

        new Rule(basedereglas,"regla77",
                new Clause[]{
                        new Clause(Suspensiondelanterafugaceite,igual,"si")
                },
                new Clause(Resultadosuspensiondelanterafugaaceite,igual," -Retenes dañados\n -Telescopio rayado\n -Exceso de aceite")
        );

        new Rule(basedereglas,"regla78",
                new Clause[]{
                        new Clause(Suspensiondelanterafugaceite,igual,"no")
                },
                new Clause(Resultadosuspensiondelanterafugaaceite,igual,"¿Golpe anormal en la suspensión delantera?")
        );

        new Rule(basedereglas,"regla79",
                new Clause[]{
                        new Clause(Suspensiondelanteragolpe,igual,"si")
                },
                new Clause(Resultadosuspensiondelanteragolpe,igual," -Contratuerca de la horquilla floja\n -Cubetas de dirección dañados\n -Rodamientos de la rueda delantera en mal estado")
        );

        new Rule(basedereglas,"regla80",
                new Clause[]{
                        new Clause(Suspensiondelanteragolpe,igual,"no")
                },
                new Clause(Resultadosuspensiondelanteragolpe,igual,"¿Jaloneo hacia un lado en la suspensión trasera?")
        );

        new Rule(basedereglas,"regla81",
                new Clause[]{
                        new Clause(Suspensionjaloneatracera,igual,"si")
                },
                new Clause(Resultadosuspensionjaloneatracera,igual," -Bujes de horquilla trasera gastados\n -Rodamientos de la rueda trasera dañados\n -Montaje deficiente del neumático")
        );

        new Rule(basedereglas,"regla82",
                new Clause[]{
                        new Clause(Suspensionjaloneatracera,igual,"no")
                },
                new Clause(Resultadosuspensionjaloneatracera,igual,"¿Manubrios no responden o no son lisos?")
        );

        new Rule(basedereglas,"regla83",
                new Clause[]{
                        new Clause(Suspensionrespondemanubrios,igual,"si")
                },
                new Clause(Resultadosuspensionrespondemanubrios,igual," -Falta de engrase de las cubetas de dirección\n -Cubetas de dirección defectuoso\n -Rueda delantera deformada")
        );

        new Rule(basedereglas,"regla84",
                new Clause[]{
                        new Clause(Frenopegadotambor,igual,"si")
                },
                new Clause(Resultadofrenospegadostambor,igual," -Desgaste excesivo de las balatas de freno\n -Falta de engrase del eje del porta balatas de freno\n -Resortes rotos")
        );

        new Rule(basedereglas,"regla85",
                new Clause[]{
                        new Clause(Frenopegadotambor,igual,"no")
                },
                new Clause(Resultadofrenospegadostambor,igual,"¿Desgaste prematuro de las balatas o pastillas de freno?")
        );

        new Rule(basedereglas,"regla86",
                new Clause[]{
                        new Clause(Frenodesgasteprematuro,igual,"si")
                },
                new Clause(Resultadofrenosdesgasteprematuro,igual," -Tambor o discos de freno en mal estado\n -Demasiado ajuste en los frenos\n -Condiciones de conducción inadecuadas")
        );

        new Rule(basedereglas,"regla87",
                new Clause[]{
                        new Clause(Frenodesgasteprematuro,igual,"no")
                },
                new Clause(Resultadofrenosdesgasteprematuro,igual,"¿Frenado deficiente en frenos de disco?")
        );

        new Rule(basedereglas,"regla88",
                new Clause[]{
                        new Clause(Frenodeficientedisco,igual,"si")
                },
                new Clause(Resultadofrenosdeficientedisco,igual," -Nivel de líquidos de frenos muy bajo\n -Fuga de líquido de frenos\n -Desgaste de las pastillas\n -Disco desgastado\n -Aire en el líquido de frenos")
        );

        new Rule(basedereglas,"regla89",
                new Clause[]{
                        new Clause(Frenodeficientedisco,igual,"no")
                },
                new Clause(Resultadofrenosdeficientedisco,igual,"¿Frenado deficiente en frenos de tambor?")
        );

        new Rule(basedereglas,"regla90",
                new Clause[]{
                        new Clause(Frenodeficientetambor,igual,"si")
                },
                new Clause(Resultadofrenosdeficientetambor,igual," -Desgaste de las balatas de freno\n -Tambor desgastado\n -Holgura amplia en la palanca del freno o en el pedal del freno")
        );

        new Rule(basedereglas,"regla91",
                new Clause[]{
                        new Clause(Frenodeficientetambor,igual,"no")
                },
                new Clause(Resultadofrenosdeficientetambor,igual,"¿Ruido metálico muy elevado en el freno de disco?")
        );

        new Rule(basedereglas,"regla92",
                new Clause[]{
                        new Clause(Frenoruidometalicodisco,igual,"si")
                },
                new Clause(Resultadofrenosruidometalicodisco,igual," -Desgaste excesivo de las pastillas de freno")
        );

        new Rule(basedereglas,"regla93",
                new Clause[]{
                        new Clause(Frenoruidometalicodisco,igual,"no")
                },
                new Clause(Resultadofrenosruidometalicodisco,igual,"¿Sonidos al frenar en frenos a disco?")
        );

        new Rule(basedereglas,"regla94",
                new Clause[]{
                        new Clause(Frenosonidosdisco,igual,"si")
                },
                new Clause(Resultadofrenossonidosdisco,igual," -Desgaste de las pastillas de freno\n -Partículas de polvo en el disco de frenos")
        );

        new Rule(basedereglas,"regla93",
                new Clause[]{
                        new Clause(Frenosonidosdisco,igual,"no")
                },
                new Clause(Resultadofrenossonidosdisco,igual,"¿Sonidos al frenar en frenos a tambor?")
        );

        new Rule(basedereglas,"regla95",
                new Clause[]{
                        new Clause(Frenosonidostambor,igual,"si")
                },
                new Clause(Resultadofrenossonidostambor,igual," -Partículas de polvo en el tambor\n -Rose del resorte de la balata con el tambor")
        );

        new Rule(basedereglas,"regla96",
                new Clause[]{
                        new Clause(Frenosonidostambor,igual,"no")
                },
                new Clause(Resultadofrenossonidostambor,igual,"¿Se queda frenado el freno a disco?")
        );

        new Rule(basedereglas,"regla97",
                new Clause[]{
                        new Clause(Frenofrenadodisco,igual,"si")
                },
                new Clause(Resultadofrenosfrenadodisco,igual," -Exceso de líquido de frenos\n -Mala alineación de las pastillas de freno\n -Disco de freno descentrado")
        );

        new Rule(basedereglas,"regla98",
                new Clause[]{
                        new Clause(Frenofrenadodisco,igual,"no")
                },
                new Clause(Resultadofrenosfrenadodisco,igual,"¿Freno de tambor trabado?")
        );

        new Rule(basedereglas,"regla99",
                new Clause[]{
                        new Clause(Frenotrabadotambor,igual,"si")
                },
                new Clause(Resultadofrenostrabadotambor,igual," -Balatas de freno roto\n -Resorte roto")
        );

        /*new Rule(basedereglas,"regladedos",
                new Clause[]{
                        new Clause(Motorpierdepotencia,igual,"no"),
                        new Clause(Resultadopotencia,igual,"si")},
                new Clause(Resultadocalienta,igual,"problemas del motor")
        );*/



    }


}
