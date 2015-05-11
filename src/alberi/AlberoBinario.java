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
public interface AlberoBinario {
    public Object radice();
    public AlberoBinario sinistro();
    public AlberoBinario destro();
    public boolean isEmpty();
    public boolean esiste(Object e);
    public String toString();
}
