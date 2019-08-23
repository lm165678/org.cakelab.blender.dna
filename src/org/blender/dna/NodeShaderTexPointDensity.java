package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'NodeShaderTexPointDensity'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=988, size64=992)
public class NodeShaderTexPointDensity extends CFacade {

	/**
	 * This is the sdna index of the struct NodeShaderTexPointDensity.
	 * <p>
	 * It is required when allocating a new block to store data for NodeShaderTexPointDensity.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 436;

	/**
	 * Field descriptor (offset) for struct member 'base'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__base);
	 * CPointer&lt;NodeTexBase&gt; p_base = p.cast(new Class[]{NodeTexBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'base'</li>
	 * <li>Signature: 'NodeTexBase'</li>
	 * <li>Actual Size (32bit/64bit): 964/968</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__base = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'point_source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__point_source);
	 * CPointer&lt;Short&gt; p_point_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'point_source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__point_source = new long[]{964, 968};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{966, 970};

	/**
	 * Field descriptor (offset) for struct member 'particle_system'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__particle_system);
	 * CPointer&lt;Integer&gt; p_particle_system = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particle_system'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particle_system = new long[]{968, 972};

	/**
	 * Field descriptor (offset) for struct member 'radius'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__radius);
	 * CPointer&lt;Float&gt; p_radius = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'radius'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__radius = new long[]{972, 976};

	/**
	 * Field descriptor (offset) for struct member 'resolution'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__resolution);
	 * CPointer&lt;Integer&gt; p_resolution = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resolution'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resolution = new long[]{976, 980};

	/**
	 * Field descriptor (offset) for struct member 'space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__space);
	 * CPointer&lt;Short&gt; p_space = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space = new long[]{980, 984};

	/**
	 * Field descriptor (offset) for struct member 'interpolation'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__interpolation);
	 * CPointer&lt;Short&gt; p_interpolation = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'interpolation'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__interpolation = new long[]{982, 986};

	/**
	 * Field descriptor (offset) for struct member 'color_source'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__color_source);
	 * CPointer&lt;Short&gt; p_color_source = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'color_source'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__color_source = new long[]{984, 988};

	/**
	 * Field descriptor (offset) for struct member 'pad2'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * NodeShaderTexPointDensity nodeshadertexpointdensity = ...;
	 * CPointer&lt;Object&gt; p = nodeshadertexpointdensity.__dna__addressof(NodeShaderTexPointDensity.__DNA__FIELD__pad2);
	 * CPointer&lt;Short&gt; p_pad2 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad2'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad2 = new long[]{986, 990};

	public NodeShaderTexPointDensity(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected NodeShaderTexPointDensity(NodeShaderTexPointDensity that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public NodeTexBase getBase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new NodeTexBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'base'.
	 * @see #__DNA__FIELD__base
	 */
	
	public void setBase(NodeTexBase base) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(base, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, base)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, base);
		} else {
			__io__generic__copy( getBase(), base);
		}
	}

	/**
	 * Get method for struct member 'point_source'.
	 * @see #__DNA__FIELD__point_source
	 */
	
	public short getPoint_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 968);
		} else {
			return __io__block.readShort(__io__address + 964);
		}
	}

	/**
	 * Set method for struct member 'point_source'.
	 * @see #__DNA__FIELD__point_source
	 */
	
	public void setPoint_source(short point_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 968, point_source);
		} else {
			__io__block.writeShort(__io__address + 964, point_source);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 970);
		} else {
			return __io__block.readShort(__io__address + 966);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 970, pad);
		} else {
			__io__block.writeShort(__io__address + 966, pad);
		}
	}

	/**
	 * Get method for struct member 'particle_system'.
	 * @see #__DNA__FIELD__particle_system
	 */
	
	public int getParticle_system() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 972);
		} else {
			return __io__block.readInt(__io__address + 968);
		}
	}

	/**
	 * Set method for struct member 'particle_system'.
	 * @see #__DNA__FIELD__particle_system
	 */
	
	public void setParticle_system(int particle_system) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 972, particle_system);
		} else {
			__io__block.writeInt(__io__address + 968, particle_system);
		}
	}

	/**
	 * Get method for struct member 'radius'.
	 * @see #__DNA__FIELD__radius
	 */
	
	public float getRadius() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 976);
		} else {
			return __io__block.readFloat(__io__address + 972);
		}
	}

	/**
	 * Set method for struct member 'radius'.
	 * @see #__DNA__FIELD__radius
	 */
	
	public void setRadius(float radius) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 976, radius);
		} else {
			__io__block.writeFloat(__io__address + 972, radius);
		}
	}

	/**
	 * Get method for struct member 'resolution'.
	 * @see #__DNA__FIELD__resolution
	 */
	
	public int getResolution() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 980);
		} else {
			return __io__block.readInt(__io__address + 976);
		}
	}

	/**
	 * Set method for struct member 'resolution'.
	 * @see #__DNA__FIELD__resolution
	 */
	
	public void setResolution(int resolution) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 980, resolution);
		} else {
			__io__block.writeInt(__io__address + 976, resolution);
		}
	}

	/**
	 * Get method for struct member 'space'.
	 * @see #__DNA__FIELD__space
	 */
	
	public short getSpace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 984);
		} else {
			return __io__block.readShort(__io__address + 980);
		}
	}

	/**
	 * Set method for struct member 'space'.
	 * @see #__DNA__FIELD__space
	 */
	
	public void setSpace(short space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 984, space);
		} else {
			__io__block.writeShort(__io__address + 980, space);
		}
	}

	/**
	 * Get method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public short getInterpolation() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 986);
		} else {
			return __io__block.readShort(__io__address + 982);
		}
	}

	/**
	 * Set method for struct member 'interpolation'.
	 * @see #__DNA__FIELD__interpolation
	 */
	
	public void setInterpolation(short interpolation) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 986, interpolation);
		} else {
			__io__block.writeShort(__io__address + 982, interpolation);
		}
	}

	/**
	 * Get method for struct member 'color_source'.
	 * @see #__DNA__FIELD__color_source
	 */
	
	public short getColor_source() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 988);
		} else {
			return __io__block.readShort(__io__address + 984);
		}
	}

	/**
	 * Set method for struct member 'color_source'.
	 * @see #__DNA__FIELD__color_source
	 */
	
	public void setColor_source(short color_source) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 988, color_source);
		} else {
			__io__block.writeShort(__io__address + 984, color_source);
		}
	}

	/**
	 * Get method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public short getPad2() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 990);
		} else {
			return __io__block.readShort(__io__address + 986);
		}
	}

	/**
	 * Set method for struct member 'pad2'.
	 * @see #__DNA__FIELD__pad2
	 */
	
	public void setPad2(short pad2) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 990, pad2);
		} else {
			__io__block.writeShort(__io__address + 986, pad2);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<NodeShaderTexPointDensity> __io__addressof() {
		return new CPointer<NodeShaderTexPointDensity>(__io__address, new Class[]{NodeShaderTexPointDensity.class}, __io__block, __io__blockTable);
	}

}