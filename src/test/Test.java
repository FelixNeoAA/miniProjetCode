package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.Segment;

import controlleur.Controlleur;
import controlleur.Outil;
import modele.Demande;
import modele.Document;
import modele.Requete;
import vue.Affichier;

public class Test {
	public static void main(String[] args) {	
		/**
		Document document = new Document();
		document.setDocChemin("G:/workspace_eclipse/Image/base" + "/" + "base1" );
		document.setDocNom("CarnetPlaniol-42XIII");
		
		Document document2 = new Document();
		document2.setDocChemin("G:/workspace_eclipse/Image/base" +"/" + "base1");
		document2.setDocNom("M0275_02_0024");
		
		List<Document> list=new ArrayList<Document>();
		list.add(document);
		list.add(document2);*/
		
		//Outil outil=new Outil();
		//outil.match("G:/workspace_eclipse/Image/base/base1", "G:/workspace_eclipse/Image/requete/element/txtfile/element_0.txt");
		//System.out.println("jieshu");
		//String string="G:/workspace_eclipse/Image/base"+"/" + "base1";
		//outil.extracer(list.get(0).getDocChemin()+"/Training/componentImg/", list.get(0).getDocChemin()+"/Training/componentImg/Binary/", list.get(0).getDocChemin()+"/Training/features", list.get(0).getDocNom());
		//outil.extracer(list.get(1).getDocChemin()+"/Training/componentImg/", list.get(1).getDocChemin()+"/Training/componentImg/Binary/", list.get(1).getDocChemin()+"/Training/features", list.get(1).getDocNom());
		
		// Requete requete=new Requete();
		// requete.createDir("E:/2017miniprojet/test/element");
		// requete.setReqNom("element");
		// requete.setReqChemin("E:/2017miniprojet/test/element");
		// requete.ecrireTXT();
		
		//Affichier affichier=new Affichier();
		//affichier.affichier();

//		Controlleur controlleur=new Controlleur();
//		Demande demande=new Demande();
//		demande.addRequete("E:\\2017miniprojet\\images\\request\\element\\element.jpg");
//		demande.addDocument("E:\\2017miniprojet\\iwordspotting\\iwordspotting\\Ressources\\Vaisseau\\Images\\M0275_02_0209.jpg");
//		demande.addRequete("E:\\2017miniprojet\\images\\images\\au.jpg");
//		demande.addDocument("E:\\2017miniprojet\\images\\images\\CarnetPlaniol-42XIII.jpg");
//		controlleur.run(demande, "lyy");
		//System.out.println(controlleur.getNomDeDocument("E:/2017miniprojet/images/images/CarnetPlaniol-42XIII.jpg"));
		 //controlleur.run();
		// controlleur.copierEtEnregister("E:/2017miniprojet/test/element.jpg",
		// "E:/2017miniprojet/test/request/element.jpg");

		//Binarisation binarisation = new Binarisation();
		//SegmentationTool segmentationTool = new SegmentationTool();
		//segmentationTool.addObserver(binarisation);
		//binarisation.binariser("./base/CarnetPlaniol-42XIII");
		//segmentationTool.segmenter("./base/CarnetPlaniol-42XIII");
		
		/**
		ExtracCaracsTool extracCaracsTool=new ExtracCaracsTool();
		extracCaracsTool.setDocNom("CarnetPlaniol-42XIII");
		extracCaracsTool.setCheminComponentImg("./base/CarnetPlaniol-42XIII/Training/componentImg/");
		extracCaracsTool.setCheminComponentImgBinary("./base/CarnetPlaniol-42XIII/Training/componentImg/Binary/");
		extracCaracsTool.setCheminFeatures("./base/CarnetPlaniol-42XIII/Training/features");
		extracCaracsTool.extracer();*/
		
		/**
		ExtracCaracsToolDoc extracCaracsToolDoc=new ExtracCaracsToolDoc();
		ExtracCaracsToolReq extracCaracsToolReq=new ExtracCaracsToolReq();
		MatchingToolBox matchingToolBox=new MatchingToolBox();
		extracCaracsToolDoc.addObserver(matchingToolBox);
		extracCaracsToolReq.addObserver(matchingToolBox);
		extracCaracsToolDoc.extracer();
		extracCaracsToolReq.extracer();*/
	}
}
