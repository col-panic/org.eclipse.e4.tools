/*******************************************************************************
 * Copyright (c) 2000, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.e4.tools.emf.ui.script.js.text.scanners;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.presentation.IPresentationReconciler;
import org.eclipse.jface.text.presentation.PresentationReconciler;
import org.eclipse.jface.text.rules.DefaultDamagerRepairer;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.SourceViewerConfiguration;

public class JavaScriptSourceViewerConfiguration extends SourceViewerConfiguration {
	private JavaScriptTextTools textTools;

	public JavaScriptSourceViewerConfiguration(JavaScriptTextTools textTools) {
		this.textTools = textTools;
	}
	
	public String[] getConfiguredContentTypes(ISourceViewer sourceViewer) {
		return new String[] {
				IDocument.DEFAULT_CONTENT_TYPE, 
				IJavaScriptPartitions.JAVA_DOC,
				IJavaScriptPartitions.JAVA_MULTI_LINE_COMMENT,
				IJavaScriptPartitions.JAVA_SINGLE_LINE_COMMENT,
				IJavaScriptPartitions.JAVA_STRING,
				IJavaScriptPartitions.JAVA_CHARACTER
		};
	}
	
	@Override
	public String getConfiguredDocumentPartitioning(ISourceViewer sourceViewer) {
		return IJavaScriptPartitions.JAVA_PARTITIONING;
	}
	
	@Override
	public IPresentationReconciler getPresentationReconciler(ISourceViewer sourceViewer) {
		PresentationReconciler reconciler= new JavaScriptPresentationReconciler();
		reconciler.setDocumentPartitioning(getConfiguredDocumentPartitioning(sourceViewer));
		
		DefaultDamagerRepairer dr= new DefaultDamagerRepairer(textTools.getCodeScanner());
		reconciler.setDamager(dr, IDocument.DEFAULT_CONTENT_TYPE);
		reconciler.setRepairer(dr, IDocument.DEFAULT_CONTENT_TYPE);

		dr= new DefaultDamagerRepairer(textTools.getJavaDocScanner());
		reconciler.setDamager(dr, IJavaScriptPartitions.JAVA_DOC);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JAVA_DOC);

		dr= new DefaultDamagerRepairer(textTools.getMultilineCommentScanner());
		reconciler.setDamager(dr, IJavaScriptPartitions.JAVA_MULTI_LINE_COMMENT);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JAVA_MULTI_LINE_COMMENT);

		dr= new DefaultDamagerRepairer(textTools.getSinglelineCommentScanner());
		reconciler.setDamager(dr, IJavaScriptPartitions.JAVA_SINGLE_LINE_COMMENT);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JAVA_SINGLE_LINE_COMMENT);

		dr= new DefaultDamagerRepairer(textTools.getStringScanner());
		reconciler.setDamager(dr, IJavaScriptPartitions.JAVA_STRING);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JAVA_STRING);

		dr= new DefaultDamagerRepairer(textTools.getStringScanner());
		reconciler.setDamager(dr, IJavaScriptPartitions.JAVA_CHARACTER);
		reconciler.setRepairer(dr, IJavaScriptPartitions.JAVA_CHARACTER);


		return reconciler;
	}
}