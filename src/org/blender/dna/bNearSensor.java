package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bNearSensor'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=80, size64=80)
public class bNearSensor extends CFacade {

	/**
	 * This is the sdna index of the struct bNearSensor.
	 * <p>
	 * It is required when allocating a new block to store data for bNearSensor.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 266;

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNearSensor bnearsensor = ...;
	 * CPointer&lt;Object&gt; p = bnearsensor.__dna__addressof(bNearSensor.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'dist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNearSensor bnearsensor = ...;
	 * CPointer&lt;Object&gt; p = bnearsensor.__dna__addressof(bNearSensor.__DNA__FIELD__dist);
	 * CPointer&lt;Float&gt; p_dist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dist = new long[]{64, 64};

	/**
	 * Field descriptor (offset) for struct member 'resetdist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNearSensor bnearsensor = ...;
	 * CPointer&lt;Object&gt; p = bnearsensor.__dna__addressof(bNearSensor.__DNA__FIELD__resetdist);
	 * CPointer&lt;Float&gt; p_resetdist = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'resetdist'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__resetdist = new long[]{68, 68};

	/**
	 * Field descriptor (offset) for struct member 'lastval'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNearSensor bnearsensor = ...;
	 * CPointer&lt;Object&gt; p = bnearsensor.__dna__addressof(bNearSensor.__DNA__FIELD__lastval);
	 * CPointer&lt;Integer&gt; p_lastval = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lastval'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lastval = new long[]{72, 72};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bNearSensor bnearsensor = ...;
	 * CPointer&lt;Object&gt; p = bnearsensor.__dna__addressof(bNearSensor.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{76, 76};

	public bNearSensor(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bNearSensor(bNearSensor that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public CArrayFacade<Byte> getName() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 0, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'name'.
	 * @see #__DNA__FIELD__name
	 */
	
	public void setName(CArrayFacade<Byte> name) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(name, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, name)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, name);
		} else {
			__io__generic__copy( getName(), name);
		}
	}

	/**
	 * Get method for struct member 'dist'.
	 * @see #__DNA__FIELD__dist
	 */
	
	public float getDist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 64);
		} else {
			return __io__block.readFloat(__io__address + 64);
		}
	}

	/**
	 * Set method for struct member 'dist'.
	 * @see #__DNA__FIELD__dist
	 */
	
	public void setDist(float dist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 64, dist);
		} else {
			__io__block.writeFloat(__io__address + 64, dist);
		}
	}

	/**
	 * Get method for struct member 'resetdist'.
	 * @see #__DNA__FIELD__resetdist
	 */
	
	public float getResetdist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 68);
		} else {
			return __io__block.readFloat(__io__address + 68);
		}
	}

	/**
	 * Set method for struct member 'resetdist'.
	 * @see #__DNA__FIELD__resetdist
	 */
	
	public void setResetdist(float resetdist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 68, resetdist);
		} else {
			__io__block.writeFloat(__io__address + 68, resetdist);
		}
	}

	/**
	 * Get method for struct member 'lastval'.
	 * @see #__DNA__FIELD__lastval
	 */
	
	public int getLastval() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 72);
		} else {
			return __io__block.readInt(__io__address + 72);
		}
	}

	/**
	 * Set method for struct member 'lastval'.
	 * @see #__DNA__FIELD__lastval
	 */
	
	public void setLastval(int lastval) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 72, lastval);
		} else {
			__io__block.writeInt(__io__address + 72, lastval);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 76);
		} else {
			return __io__block.readInt(__io__address + 76);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 76, pad);
		} else {
			__io__block.writeInt(__io__address + 76, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bNearSensor> __io__addressof() {
		return new CPointer<bNearSensor>(__io__address, new Class[]{bNearSensor.class}, __io__block, __io__blockTable);
	}

}
