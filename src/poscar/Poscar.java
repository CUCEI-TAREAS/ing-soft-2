package poscar;

import db.Db;
import db.Connector;
import db.ConFile;
import gui.Gui_Connect_Db;

import java.io.IOException;

public class Poscar {

    private String FILE_DB = "con_db.txt";

	public Db db;
    public Connector con;
    public ConFile filedb;
//	public Window win;

	public void Poscar(){}

	public static void main(String[] args){
		Poscar app = new Poscar();
        app.start();
	}

    public void start(){

		filedb = new ConFile(FILE_DB);

		try{

            Gui_Connect_Db gui_condb = new Gui_Connect_Db();
            gui_condb.init();

			if ( filedb.fileExists() ){
				db = filedb.loadfile();
				if ( db == null ){
					// TODO raise error wrong dbfile
					// TODO raise form to create database
				}
				else if ( db.check() ){

				}

				if ( Connector.tryConnect(db)){
					//dbfile correct
					// open interface to insert dbfile data
					System.out.println("well");
				} else {
					//dbfile wrong connection
				}
			} else{
				// create dbfile
				// open interface to insert dbfile data
			}
		} catch( IOException e){
			System.out.println( e.getMessage());
		}
    }
}
