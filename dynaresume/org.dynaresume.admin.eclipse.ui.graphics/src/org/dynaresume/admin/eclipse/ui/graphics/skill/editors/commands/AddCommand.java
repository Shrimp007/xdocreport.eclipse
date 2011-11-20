/*******************************************************************************
 * Copyright (c) 2003, 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.dynaresume.admin.eclipse.ui.graphics.skill.editors.commands;

import org.dynaresume.admin.eclipse.ui.graphics.skill.editors.model.TreeNode;
import org.eclipse.gef.commands.Command;

/**
 * AddCommand
 * 
 * @author Daniel Lee
 */
public class AddCommand extends Command {

	private TreeNode child;
	private TreeNode parent;

	/**
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		parent.addChild(child);
	}

	/**
	 * Returns the StructuredActivity that is the parent
	 * 
	 * @return the parent
	 */
	public TreeNode getParent() {
		return parent;
	}

	/**
	 * Sets the child to the passed Activity
	 * 
	 * @param subpart
	 *            the child
	 */
	public void setChild(TreeNode newChild) {
		child = newChild;
	}

	/**
	 * Sets the parent to the passed StructuredActiivty
	 * 
	 * @param newParent
	 *            the parent
	 */
	public void setParent(TreeNode newParent) {
		parent = newParent;
	}

	/**
	 * @see org.eclipse.gef.commands.Command#undo()
	 */
	public void undo() {
		parent.removeChild(child);
	}

}