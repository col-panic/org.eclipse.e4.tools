package org.eclipse.e4.tools.emf.ui.script.js.text.scanners;

import org.eclipse.e4.tools.emf.ui.script.js.ResourceProvider;
import org.eclipse.e4.tools.services.IResourcePool;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension3;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.jface.text.rules.FastPartitioner;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.eclipse.jface.text.rules.ITokenScanner;

public class JavaScriptTextTools {
	/**
	 * Array with legal content types.
	 * @since 3.0
	 */
	private final static String[] LEGAL_CONTENT_TYPES= new String[] {
		IJavaScriptPartitions.JAVA_DOC,
		IJavaScriptPartitions.JAVA_MULTI_LINE_COMMENT,
		IJavaScriptPartitions.JAVA_SINGLE_LINE_COMMENT,
		IJavaScriptPartitions.JAVA_STRING,
		IJavaScriptPartitions.JAVA_CHARACTER
	};

//	/**
//	 * This tools' preference listener.
//	 */
//	private class PreferenceListener implements IPropertyChangeListener {
//		public void propertyChange(PropertyChangeEvent event) {
//			adaptToPreferenceChange(event);
//		}
//	}
	
	/** The Java source code scanner. */
	private JavaScriptCodeScanner fCodeScanner;
	/** The Java multi-line comment scanner. */
	private JavaScriptCommentScanner fMultilineCommentScanner;
	/** The Java single-line comment scanner. */
	private JavaScriptCommentScanner fSinglelineCommentScanner;
	/** The Java string scanner. */
	private SingleTokenJavaScanner fStringScanner;
	/** The JavaDoc scanner. */
	private JavaScriptDocScanner fJavaDocScanner;
//	/** The preference store. */
//	private IPreferenceStore fPreferenceStore;
	
	/**
	 * The core preference store.
	 * @since 2.1
	 */
	/** The preference change listener */
//	private PreferenceListener fPreferenceListener= new PreferenceListener();

	public JavaScriptTextTools(IResourcePool resourcePool, IPreferenceStore store) {
//		fPreferenceStore = store;
//		fPreferenceStore.addPropertyChangeListener(fPreferenceListener);
		
		fCodeScanner= new JavaScriptCodeScanner(resourcePool, store);
		fMultilineCommentScanner= new JavaScriptCommentScanner(resourcePool, store, ResourceProvider.JAVA_MULTI_LINE_COMMENT);
		fSinglelineCommentScanner= new JavaScriptCommentScanner(resourcePool, store, ResourceProvider.JAVA_SINGLE_LINE_COMMENT);
		fStringScanner= new SingleTokenJavaScanner(resourcePool, store, ResourceProvider.JAVA_STRING);
		fJavaDocScanner= new JavaScriptDocScanner(resourcePool, store);
	}
	
	public ITokenScanner getMultilineCommentScanner() {
		return fMultilineCommentScanner;
	}
	
	public ITokenScanner getSinglelineCommentScanner() {
		return fSinglelineCommentScanner;
	}
	
	public ITokenScanner getStringScanner() {
		return fStringScanner;
	}
	
	public ITokenScanner getJavaDocScanner() {
		return fJavaDocScanner;
	}
	
	public ITokenScanner getCodeScanner() {
		return fCodeScanner;
	}
	
	/**
	 * Sets up the Java document partitioner for the given document for the given partitioning.
	 *
	 * @param document the document to be set up
	 * @param partitioning the document partitioning
	 * @since 3.0
	 */
	public void setupJavaDocumentPartitioner(IDocument document, String partitioning) {
		IDocumentPartitioner partitioner= createDocumentPartitioner();
		if (document instanceof IDocumentExtension3) {
			IDocumentExtension3 extension3= (IDocumentExtension3) document;
			extension3.setDocumentPartitioner(partitioning, partitioner);
		} else {
			document.setDocumentPartitioner(partitioner);
		}
		partitioner.connect(document);
	}
	
	/**
	 * Returns a scanner which is configured to scan
	 * Java-specific partitions, which are multi-line comments,
	 * Javadoc comments, and regular Java source code.
	 *
	 * @return a Java partition scanner
	 */
	public IPartitionTokenScanner getPartitionScanner() {
		return new FastJavaScriptPartitionScanner();
	}

	/**
	 * Factory method for creating a Java-specific document partitioner
	 * using this object's partitions scanner. This method is a
	 * convenience method.
	 *
	 * @return a newly created Java document partitioner
	 */
	public IDocumentPartitioner createDocumentPartitioner() {
		return new FastPartitioner(getPartitionScanner(), LEGAL_CONTENT_TYPES);
	}
	
//	/**
//	 * Adapts the behavior of the contained components to the change
//	 * encoded in the given event.
//	 *
//	 * @param event the event to which to adapt
//	 * @since 2.0
//	 */
//	private void adaptToPreferenceChange(PropertyChangeEvent event) {
//		if (fCodeScanner.affectsBehavior(event))
//			fCodeScanner.adaptToPreferenceChange(event);
//		if (fMultilineCommentScanner.affectsBehavior(event))
//			fMultilineCommentScanner.adaptToPreferenceChange(event);
//		if (fSinglelineCommentScanner.affectsBehavior(event))
//			fSinglelineCommentScanner.adaptToPreferenceChange(event);
//		if (fStringScanner.affectsBehavior(event))
//			fStringScanner.adaptToPreferenceChange(event);
//		if (fJavaDocScanner.affectsBehavior(event))
//			fJavaDocScanner.adaptToPreferenceChange(event);
//	}
}
