package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'bConstraintTarget'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=148, size64=160)
public class bConstraintTarget extends CFacade {

	/**
	 * This is the sdna index of the struct bConstraintTarget.
	 * <p>
	 * It is required when allocating a new block to store data for bConstraintTarget.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 326;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;bConstraintTarget&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, bConstraintTarget.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'bConstraintTarget*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__next = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'prev'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;bConstraintTarget&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, bConstraintTarget.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'bConstraintTarget*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'tar'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__tar);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_tar = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tar'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tar = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'subtarget'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__subtarget);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_subtarget = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'subtarget'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__subtarget = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'matrix'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__matrix);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_matrix = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'matrix'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__matrix = new long[]{76, 88};

	/**
	 * Field descriptor (offset) for struct member 'space'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__space);
	 * CPointer&lt;Short&gt; p_space = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'space'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__space = new long[]{140, 152};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__flag);
	 * CPointer&lt;Short&gt; p_flag = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{142, 154};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{144, 156};

	/**
	 * Field descriptor (offset) for struct member 'rotOrder'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * bConstraintTarget bconstrainttarget = ...;
	 * CPointer&lt;Object&gt; p = bconstrainttarget.__dna__addressof(bConstraintTarget.__DNA__FIELD__rotOrder);
	 * CPointer&lt;Short&gt; p_rotOrder = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rotOrder'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rotOrder = new long[]{146, 158};

	public bConstraintTarget(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected bConstraintTarget(bConstraintTarget that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<bConstraintTarget> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bConstraintTarget.class};
		return new CPointer<bConstraintTarget>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bConstraintTarget.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<bConstraintTarget> next) throws IOException
	{
		long __address = ((next == null) ? 0 : next.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public CPointer<bConstraintTarget> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bConstraintTarget.class};
		return new CPointer<bConstraintTarget>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bConstraintTarget.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<bConstraintTarget> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public CPointer<BlenderObject> getTar() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tar'.
	 * @see #__DNA__FIELD__tar
	 */
	
	public void setTar(CPointer<BlenderObject> tar) throws IOException
	{
		long __address = ((tar == null) ? 0 : tar.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'subtarget'.
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public CArrayFacade<Byte> getSubtarget() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Byte.class};
		int[] __dna__dimensions = new int[]{
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Byte>(__io__address + 24, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 12, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'subtarget'.
	 * @see #__DNA__FIELD__subtarget
	 */
	
	public void setSubtarget(CArrayFacade<Byte> subtarget) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 24;
		} else {
			__dna__offset = 12;
		}
		if (__io__equals(subtarget, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, subtarget)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, subtarget);
		} else {
			__io__generic__copy( getSubtarget(), subtarget);
		}
	}

	/**
	 * Get method for struct member 'matrix'.
	 * @see #__DNA__FIELD__matrix
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getMatrix() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 88, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 76, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'matrix'.
	 * @see #__DNA__FIELD__matrix
	 */
	
	public void setMatrix(CArrayFacade<CArrayFacade<Float>> matrix) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(matrix, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, matrix)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, matrix);
		} else {
			__io__generic__copy( getMatrix(), matrix);
		}
	}

	/**
	 * Get method for struct member 'space'.
	 * @see #__DNA__FIELD__space
	 */
	
	public short getSpace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 152);
		} else {
			return __io__block.readShort(__io__address + 140);
		}
	}

	/**
	 * Set method for struct member 'space'.
	 * @see #__DNA__FIELD__space
	 */
	
	public void setSpace(short space) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 152, space);
		} else {
			__io__block.writeShort(__io__address + 140, space);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public short getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 154);
		} else {
			return __io__block.readShort(__io__address + 142);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(short flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 154, flag);
		} else {
			__io__block.writeShort(__io__address + 142, flag);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 156);
		} else {
			return __io__block.readShort(__io__address + 144);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 156, type);
		} else {
			__io__block.writeShort(__io__address + 144, type);
		}
	}

	/**
	 * Get method for struct member 'rotOrder'.
	 * @see #__DNA__FIELD__rotOrder
	 */
	
	public short getRotOrder() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 158);
		} else {
			return __io__block.readShort(__io__address + 146);
		}
	}

	/**
	 * Set method for struct member 'rotOrder'.
	 * @see #__DNA__FIELD__rotOrder
	 */
	
	public void setRotOrder(short rotOrder) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 158, rotOrder);
		} else {
			__io__block.writeShort(__io__address + 146, rotOrder);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<bConstraintTarget> __io__addressof() {
		return new CPointer<bConstraintTarget>(__io__address, new Class[]{bConstraintTarget.class}, __io__block, __io__blockTable);
	}

}
