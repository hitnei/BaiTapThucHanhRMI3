/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author NHI
 */
public interface ITinhToan extends Remote {
    public ArrayList GetSv() throws RemoteException;

    public ArrayList TimSv(String hoten) throws RemoteException;
}
