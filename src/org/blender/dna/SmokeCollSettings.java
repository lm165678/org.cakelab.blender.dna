package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SmokeCollSettings'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=20, size64=32)
public class SmokeCollSettings extends CFacade {

	/**
	 * This is the sdna index of the struct SmokeCollSettings.
	 * <p>
	 * It is required when allocating a new block to store data for SmokeCollSettings.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 503;

	/**
	 * Field descriptor (offset) for struct member 'smd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeCollSettings smokecollsettings = ...;
	 * CPointer&lt;Object&gt; p = smokecollsettings.__dna__addressof(SmokeCollSettings.__DNA__FIELD__smd);
	 * CPointer&lt;CPointer&lt;SmokeModifierData&gt;&gt; p_smd = p.cast(new Class[]{CPointer.class, SmokeModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'smd'</li>
	 * <li>Signature: 'SmokeModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__smd = new long[]{0, 0};

	/**
	 * Field descriptor (offset) for struct member 'dm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeCollSettings smokecollsettings = ...;
	 * CPointer&lt;Object&gt; p = smokecollsettings.__dna__addressof(SmokeCollSettings.__DNA__FIELD__dm);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_dm = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dm'</li>
	 * <li>Signature: 'DerivedMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dm = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'verts_old'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeCollSettings smokecollsettings = ...;
	 * CPointer&lt;Object&gt; p = smokecollsettings.__dna__addressof(SmokeCollSettings.__DNA__FIELD__verts_old);
	 * CPointer&lt;CPointer&lt;Float&gt;&gt; p_verts_old = p.cast(new Class[]{CPointer.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'verts_old'</li>
	 * <li>Signature: 'float*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__verts_old = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'numverts'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeCollSettings smokecollsettings = ...;
	 * CPointer&lt;Object&gt; p = smokecollsettings.__dna__addressof(SmokeCollSettings.__DNA__FIELD__numverts);
	 * CPointer&lt;Integer&gt; p_numverts = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'numverts'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__numverts = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'type'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeCollSettings smokecollsettings = ...;
	 * CPointer&lt;Object&gt; p = smokecollsettings.__dna__addressof(SmokeCollSettings.__DNA__FIELD__type);
	 * CPointer&lt;Short&gt; p_type = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'type'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__type = new long[]{16, 28};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SmokeCollSettings smokecollsettings = ...;
	 * CPointer&lt;Object&gt; p = smokecollsettings.__dna__addressof(SmokeCollSettings.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{18, 30};

	public SmokeCollSettings(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SmokeCollSettings(SmokeCollSettings that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'smd'.
	 * @see #__DNA__FIELD__smd
	 */
	
	public CPointer<SmokeModifierData> getSmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SmokeModifierData.class};
		return new CPointer<SmokeModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SmokeModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'smd'.
	 * @see #__DNA__FIELD__smd
	 */
	
	public void setSmd(CPointer<SmokeModifierData> smd) throws IOException
	{
		long __address = ((smd == null) ? 0 : smd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 0, __address);
		} else {
			__io__block.writeLong(__io__address + 0, __address);
		}
	}

	/**
	 * Get method for struct member 'dm'.
	 * @see #__DNA__FIELD__dm
	 */
	
	public CPointer<Object> getDm() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'dm'.
	 * @see #__DNA__FIELD__dm
	 */
	
	public void setDm(CPointer<Object> dm) throws IOException
	{
		long __address = ((dm == null) ? 0 : dm.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'verts_old'.
	 * @see #__DNA__FIELD__verts_old
	 */
	
	public CPointer<Float> getVerts_old() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		return new CPointer<Float>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'verts_old'.
	 * @see #__DNA__FIELD__verts_old
	 */
	
	public void setVerts_old(CPointer<Float> verts_old) throws IOException
	{
		long __address = ((verts_old == null) ? 0 : verts_old.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public int getNumverts() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 24);
		} else {
			return __io__block.readInt(__io__address + 12);
		}
	}

	/**
	 * Set method for struct member 'numverts'.
	 * @see #__DNA__FIELD__numverts
	 */
	
	public void setNumverts(int numverts) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 24, numverts);
		} else {
			__io__block.writeInt(__io__address + 12, numverts);
		}
	}

	/**
	 * Get method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public short getType() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 28);
		} else {
			return __io__block.readShort(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'type'.
	 * @see #__DNA__FIELD__type
	 */
	
	public void setType(short type) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 28, type);
		} else {
			__io__block.writeShort(__io__address + 16, type);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 30);
		} else {
			return __io__block.readShort(__io__address + 18);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 30, pad);
		} else {
			__io__block.writeShort(__io__address + 18, pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SmokeCollSettings> __io__addressof() {
		return new CPointer<SmokeCollSettings>(__io__address, new Class[]{SmokeCollSettings.class}, __io__block, __io__blockTable);
	}

}
