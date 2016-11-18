package de.lathanda.eos.robot.gui;

import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;

import com.jogamp.opengl.GL;
import com.jogamp.opengl.GL2;

import de.lathanda.eos.robot.geom3d.Polyhedron;

public class GLObjectBuffer {
	// ***************** factory *****************
	private static HashMap<Polyhedron, GLObjectBuffer> glbuffer = new HashMap<>();	
	public static synchronized GLObjectBuffer get(Polyhedron poly) {
		GLObjectBuffer buffer = glbuffer.get(poly);
		if (buffer == null) {
			buffer = new GLObjectBuffer(poly);
			glbuffer.put(poly, buffer);
		}
		return buffer;    
	}
	public static synchronized void clear(GL gl) {
		for(GLObjectBuffer buffer : glbuffer.values()) {
			buffer.destroy(gl);
		}
	}		
	
	//****************** class *******************
	private final Polyhedron data;
	private LinkedList<GLRenderObject> ro;

	private GLObjectBuffer(Polyhedron poly) {
		this.data = poly;
	}
	public void destroy(GL gl) {
		//free resources on graphic card
		if (ro != null) {
			ro.forEach( r->r.destroy(gl));
		}
	}	
	public void render(Color base, GL2 gl) {
		if (ro == null) {
	        final boolean VBOsupported = gl.isFunctionAvailable("glGenBuffersARB") &&
	                gl.isFunctionAvailable("glBindBufferARB") &&
	                gl.isFunctionAvailable("glBufferDataARB") &&
	                gl.isFunctionAvailable("glDeleteBuffersARB");
	        if (VBOsupported) {
	        	ro = VertexBufferObject.create(data);
	        } else {
	        	ro = new LinkedList<>();
	        	ro.add(new GLBaseRenderObject(data));
	        }			
		}
		ro.forEach( r -> r.render(gl, base));
	}

}
