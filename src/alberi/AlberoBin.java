/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alberi;

/**
 *
 * @author SKIABO
 */
public class AlberoBin implements AlberoBinario {
    protected NodoBin radice;
    
    public AlberoBin() {
        this.radice = null;
    }
    
    public AlberoBin(AlberoBin sx, Object info, AlberoBin dx) {
        radice = new NodoBin();
        radice.info = info;
        radice.sinistro = sx.radice;
        radice.destro = dx.radice;        
    }
    
    public boolean isEmpty() {
        return (radice == null);
    }

    public Object radice() {
        if (isEmpty()) throw new EccezioneAlberoVuoto("Impossibile ottenere la radice di un albero vuoto");
        else return radice.info;
        
    }
    
    public AlberoBinario sinistro() {
        if (isEmpty()) throw new EccezioneAlberoVuoto("Impossibile ottenere il sottoalbero sinistro di un albero vuoto");
        else {
            AlberoBin sin = new AlberoBin();
            sin.radice = radice.sinistro;
            return sin;
        }
    }
    
    public AlberoBinario destro() {
        if (isEmpty()) throw new EccezioneAlberoVuoto("Impossibile ottenere il sottoalbero destro di un albero vuoto");
        else {
            AlberoBin des = new AlberoBin();
            des.radice = radice.destro;
            return des;
        }
    }
    
    private static boolean esisteRic(NodoBin a, Object e) {
        if (a==null) return false;
        else if (a.info.equals(e)) return true;
             else return esisteRic(a.sinistro, e) || esisteRic(a.destro, e); 
    }
    
    public boolean esiste(Object e) {
        return esisteRic(radice, e);
    }
    
    public String toStringRic(NodoBin a) {
        if (a==null) return "()";
        else return "(" + a.info + " " + toStringRic(a.sinistro) + " " + toStringRic(a.destro) + ")";
    }
    
    public String toString() {
        return toStringRic(radice);
    }
    
}
