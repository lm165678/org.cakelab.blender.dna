package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ReportList'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=28, size64=40)
public class ReportList extends CFacade {

	/**
	 * This is the sdna index of the struct ReportList.
	 * <p>
	 * It is required when allocating a new block to store data for ReportList.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 443;

	/**
	 * Field descriptor (offset) for struct member 'list'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ReportList reportlist = ...;
	 * CPointer&lt;Object&gt; p = reportlist.__dna__addressof(ReportList.__DNA__FIELD__list);
	 * CPointer&lt;ListBase&gt; p_list = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'list'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__list = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'printlevel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ReportList reportlist = ...;
	 * CPointer&lt;Object&gt; p = reportlist.__dna__addressof(ReportList.__DNA__FIELD__printlevel);
	 * CPointer&lt;Integer&gt; p_printlevel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'printlevel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__printlevel = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'storelevel'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ReportList reportlist = ...;
	 * CPointer&lt;Object&gt; p = reportlist.__dna__addressof(ReportList.__DNA__FIELD__storelevel);
	 * CPointer&lt;Integer&gt; p_storelevel = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'storelevel'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__storelevel = new long[]{12, 20};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ReportList reportlist = ...;
	 * CPointer&lt;Object&gt; p = reportlist.__dna__addressof(ReportList.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{16, 24};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ReportList reportlist = ...;
	 * CPointer&lt;Object&gt; p = reportlist.__dna__addressof(ReportList.__DNA__FIELD__pad);
	 * CPointer&lt;Integer&gt; p_pad = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{20, 28};

	/**
	 * Field descriptor (offset) for struct member 'reporttimer'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ReportList reportlist = ...;
	 * CPointer&lt;Object&gt; p = reportlist.__dna__addressof(ReportList.__DNA__FIELD__reporttimer);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_reporttimer = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'reporttimer'</li>
	 * <li>Signature: 'wmTimer*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__reporttimer = new long[]{24, 32};

	public ReportList(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ReportList(ReportList that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'list'.
	 * @see #__DNA__FIELD__list
	 */
	
	public ListBase getList() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 0, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'list'.
	 * @see #__DNA__FIELD__list
	 */
	
	public void setList(ListBase list) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 0;
		} else {
			__dna__offset = 0;
		}
		if (__io__equals(list, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, list)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, list);
		} else {
			__io__generic__copy( getList(), list);
		}
	}

	/**
	 * Get method for struct member 'printlevel'.
	 * @see #__DNA__FIELD__printlevel
	 */
	
	public int getPrintlevel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 16);
		} else {
			return __io__block.readInt(__io__address + 8);
		}
	}

	/**
	 * Set method for struct member 'printlevel'.
	 * @see #__DNA__FIELD__printlevel
	 */
	
	public void setPrintlevel(int printlevel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 16, printlevel);
		} else {
			__io__block.writeInt(__io__address + 8, printlevel);
		}
	}

	/**
	 * Get method for struct member 'storelevel'.
	 * @see #__DNA__FIELD__storelevel
	 */
	
	public int getStorelevel() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 20);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'storelevel'.
	 * @see #__DNA__FIELD__storelevel
	 */
	
	public void setStorelevel(int storelevel) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 20, storelevel);
		} else {
			__io__block.writeInt(__io__address + 12, storelevel);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, flag);
		} else {
			__io__block.writeInt(__io__address + 16, flag);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public int getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 28);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(int pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 28, pad);
		} else {
			__io__block.writeInt(__io__address + 20, pad);
		}
	}

	/**
	 * Get method for struct member 'reporttimer'.
	 * @see #__DNA__FIELD__reporttimer
	 */
	
	public CPointer<Object> getReporttimer() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'reporttimer'.
	 * @see #__DNA__FIELD__reporttimer
	 */
	
	public void setReporttimer(CPointer<Object> reporttimer) throws IOException
	{
		long __address = ((reporttimer == null) ? 0 : reporttimer.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ReportList> __io__addressof() {
		return new CPointer<ReportList>(__io__address, new Class[]{ReportList.class}, __io__block, __io__blockTable);
	}

}