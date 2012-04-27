package at.ac.univie.mminf.luceneSKOS.skos;

import java.io.IOException;

/**
 * An interface to the used SKOS model. It provides accessors to all the data
 * needed for the expansion process.
 * 
 * @author Bernhard Haslhofer <bernhard.haslhofer@univie.ac.at>
 * 
 */
public interface SKOSEngine {
  
  /**
   * Returns the preferred labels (prefLabel) for a given concept URI
   * 
   * @param conceptURI
   * @return String[]
   * @throws IOException
   */
  String[] getPrefLabels(String conceptURI) throws IOException;
  
  /**
   * Returns the alternative labels (altLabel) for a given concept URI
   * 
   * @param conceptURI
   * @return String[]
   * @throws IOException
   */
  String[] getAltLabels(String conceptURI) throws IOException;
  
  /**
   * Returns the URIs of all broader concepts for a given concept URI
   * 
   * @param conceptURI
   * @return String[]
   * @throws Exception
   */
  String[] getBroaderConcepts(String conceptURI) throws IOException;
  
  /**
   * Returns the URIs of all narrower concepts for a given concept URI
   * 
   * @param conceptURI
   * @return String[]
   * @throws Exception
   */
  String[] getNarrowerConcepts(String conceptURI) throws IOException;
  
  /**
   * Returns the labels (prefLabel + altLabel) of ALL broader concepts for a
   * given concept URI
   * 
   * @param conceptURI
   * @return String[]
   * @throws IOException
   */
  String[] getBroaderLabels(String conceptURI) throws IOException;
  
  /**
   * Returns the labels (prefLabel + altLabel) of ALL narrower concepts for a
   * given URI
   * 
   * @param conceptURI
   * @return String[]
   * @throws IOException
   */
  String[] getNarrowerLabels(String conceptURI) throws IOException;
  
  /**
   * Returns all concepts (URIs) matching a given preferred label
   * 
   * @param prefLabel
   * @return String[]
   * @throws IOException
   */
  String[] getConcepts(String prefLabel) throws IOException;
  
  /**
   * Returns all alternative terms for a given preferred label
   * 
   * @param prefLabel
   * @return String[]
   * @throws IOException
   */
  String[] getAltTerms(String prefLabel) throws IOException;
  
}