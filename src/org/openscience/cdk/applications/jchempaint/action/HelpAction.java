/*
 *  $RCSfile$
 *  $Author$
 *  $Date$
 *  $Revision$
 *
 *  Copyright (C) 2003-2005  The JChemPaint project
 *
 *  Contact: jchempaint-devel@lists.sourceforge.net
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public License
 *  as published by the Free Software Foundation; either version 2.1
 *  of the License, or (at your option) any later version.
 *  All we ask is that proper credit is given for our work, which includes
 *  - but is not limited to - adding the above copyright notice to the beginning
 *  of your source code files, and to any copyright notice that you may distribute
 *  with programs based on this work.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package org.openscience.cdk.applications.jchempaint.action;

import java.awt.event.ActionEvent;
import java.net.URL;

import javax.help.*;

import org.openscience.cdk.applications.jchempaint.dialogs.HelpDialog;
import org.openscience.cdk.applications.jchempaint.dialogs.JavaHelpDialog;

/**
 * pops up the help
 *
 * @cdk.module jchempaint
 * @author     steinbeck
 */
public class HelpAction extends JCPAction
{

	/**
	 *  Description of the Method
	 *
	 *@param  e  Description of the Parameter
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (type.equals("tutorial"))
		{
			new HelpDialog(null, "doc/userhelp/ch02.html").show();
		}  else
		{
		    try
			{
		        JavaHelpDialog jHD = new JavaHelpDialog();
		        jHD.getDisplayHelp().actionPerformed(e);
		        
			}catch (Exception ee)
			{
				System.out.println("HelpSet: "+ee.getMessage());
				System.out.println("HelpSet: "+" not found");
			}
		}
	}
}

