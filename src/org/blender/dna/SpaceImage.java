package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'SpaceImage'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=10532, size64=10584)
public class SpaceImage extends CFacade {

	/**
	 * This is the sdna index of the struct SpaceImage.
	 * <p>
	 * It is required when allocating a new block to store data for SpaceImage.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 194;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'SpaceLink*'</li>
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
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;SpaceLink&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, SpaceLink.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'SpaceLink*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'regionbase'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__regionbase);
	 * CPointer&lt;ListBase&gt; p_regionbase = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'regionbase'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__regionbase = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'spacetype'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__spacetype);
	 * CPointer&lt;Integer&gt; p_spacetype = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'spacetype'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__spacetype = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{20, 36};

	/**
	 * Field descriptor (offset) for struct member 'image'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__image);
	 * CPointer&lt;CPointer&lt;Image&gt;&gt; p_image = p.cast(new Class[]{CPointer.class, Image.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'image'</li>
	 * <li>Signature: 'Image*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__image = new long[]{24, 40};

	/**
	 * Field descriptor (offset) for struct member 'iuser'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__iuser);
	 * CPointer&lt;ImageUser&gt; p_iuser = p.cast(new Class[]{ImageUser.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'iuser'</li>
	 * <li>Signature: 'ImageUser'</li>
	 * <li>Actual Size (32bit/64bit): 36/40</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__iuser = new long[]{28, 48};

	/**
	 * Field descriptor (offset) for struct member 'cumap'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__cumap);
	 * CPointer&lt;CPointer&lt;CurveMapping&gt;&gt; p_cumap = p.cast(new Class[]{CPointer.class, CurveMapping.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cumap'</li>
	 * <li>Signature: 'CurveMapping*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cumap = new long[]{64, 88};

	/**
	 * Field descriptor (offset) for struct member 'scopes'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__scopes);
	 * CPointer&lt;Scopes&gt; p_scopes = p.cast(new Class[]{Scopes.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'scopes'</li>
	 * <li>Signature: 'Scopes'</li>
	 * <li>Actual Size (32bit/64bit): 5248/5264</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__scopes = new long[]{68, 96};

	/**
	 * Field descriptor (offset) for struct member 'sample_line_hist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__sample_line_hist);
	 * CPointer&lt;Histogram&gt; p_sample_line_hist = p.cast(new Class[]{Histogram.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sample_line_hist'</li>
	 * <li>Signature: 'Histogram'</li>
	 * <li>Actual Size (32bit/64bit): 5160/5160</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sample_line_hist = new long[]{5316, 5360};

	/**
	 * Field descriptor (offset) for struct member 'gpd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__gpd);
	 * CPointer&lt;CPointer&lt;bGPdata&gt;&gt; p_gpd = p.cast(new Class[]{CPointer.class, bGPdata.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'gpd'</li>
	 * <li>Signature: 'bGPdata*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__gpd = new long[]{10476, 10520};

	/**
	 * Field descriptor (offset) for struct member 'cursor'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__cursor);
	 * CPointer&lt;CArrayFacade&lt;Float&gt;&gt; p_cursor = p.cast(new Class[]{CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cursor'</li>
	 * <li>Signature: 'float[2]'</li>
	 * <li>Actual Size (32bit/64bit): 8/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cursor = new long[]{10480, 10528};

	/**
	 * Field descriptor (offset) for struct member 'xof'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__xof);
	 * CPointer&lt;Float&gt; p_xof = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'xof'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__xof = new long[]{10488, 10536};

	/**
	 * Field descriptor (offset) for struct member 'yof'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__yof);
	 * CPointer&lt;Float&gt; p_yof = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'yof'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__yof = new long[]{10492, 10540};

	/**
	 * Field descriptor (offset) for struct member 'zoom'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__zoom);
	 * CPointer&lt;Float&gt; p_zoom = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'zoom'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__zoom = new long[]{10496, 10544};

	/**
	 * Field descriptor (offset) for struct member 'centx'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__centx);
	 * CPointer&lt;Float&gt; p_centx = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'centx'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__centx = new long[]{10500, 10548};

	/**
	 * Field descriptor (offset) for struct member 'centy'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__centy);
	 * CPointer&lt;Float&gt; p_centy = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'centy'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__centy = new long[]{10504, 10552};

	/**
	 * Field descriptor (offset) for struct member 'mode'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__mode);
	 * CPointer&lt;Byte&gt; p_mode = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mode'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mode = new long[]{10508, 10556};

	/**
	 * Field descriptor (offset) for struct member 'pin'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__pin);
	 * CPointer&lt;Byte&gt; p_pin = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pin'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pin = new long[]{10509, 10557};

	/**
	 * Field descriptor (offset) for struct member 'pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__pad);
	 * CPointer&lt;Short&gt; p_pad = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pad'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pad = new long[]{10510, 10558};

	/**
	 * Field descriptor (offset) for struct member 'curtile'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__curtile);
	 * CPointer&lt;Short&gt; p_curtile = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'curtile'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__curtile = new long[]{10512, 10560};

	/**
	 * Field descriptor (offset) for struct member 'lock'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__lock);
	 * CPointer&lt;Short&gt; p_lock = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lock'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lock = new long[]{10514, 10562};

	/**
	 * Field descriptor (offset) for struct member 'dt_uv'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__dt_uv);
	 * CPointer&lt;Byte&gt; p_dt_uv = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dt_uv'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dt_uv = new long[]{10516, 10564};

	/**
	 * Field descriptor (offset) for struct member 'sticky'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__sticky);
	 * CPointer&lt;Byte&gt; p_sticky = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'sticky'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__sticky = new long[]{10517, 10565};

	/**
	 * Field descriptor (offset) for struct member 'dt_uvstretch'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__dt_uvstretch);
	 * CPointer&lt;Byte&gt; p_dt_uvstretch = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dt_uvstretch'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dt_uvstretch = new long[]{10518, 10566};

	/**
	 * Field descriptor (offset) for struct member 'around'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__around);
	 * CPointer&lt;Byte&gt; p_around = p.cast(new Class[]{Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'around'</li>
	 * <li>Signature: 'char'</li>
	 * <li>Actual Size (32bit/64bit): 1/1</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__around = new long[]{10519, 10567};

	/**
	 * Field descriptor (offset) for struct member 'mask_info'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * SpaceImage spaceimage = ...;
	 * CPointer&lt;Object&gt; p = spaceimage.__dna__addressof(SpaceImage.__DNA__FIELD__mask_info);
	 * CPointer&lt;MaskSpaceInfo&gt; p_mask_info = p.cast(new Class[]{MaskSpaceInfo.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'mask_info'</li>
	 * <li>Signature: 'MaskSpaceInfo'</li>
	 * <li>Actual Size (32bit/64bit): 12/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__mask_info = new long[]{10520, 10568};

	public SpaceImage(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected SpaceImage(SpaceImage that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<SpaceLink> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<SpaceLink> next) throws IOException
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
	
	public CPointer<SpaceLink> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{SpaceLink.class};
		return new CPointer<SpaceLink>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, SpaceLink.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<SpaceLink> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'regionbase'.
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public ListBase getRegionbase() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 16, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 8, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'regionbase'.
	 * @see #__DNA__FIELD__regionbase
	 */
	
	public void setRegionbase(ListBase regionbase) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 16;
		} else {
			__dna__offset = 8;
		}
		if (__io__equals(regionbase, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, regionbase)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, regionbase);
		} else {
			__io__generic__copy( getRegionbase(), regionbase);
		}
	}

	/**
	 * Get method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public int getSpacetype() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 32);
		} else {
			return __io__block.readInt(__io__address + 16);
		}
	}

	/**
	 * Set method for struct member 'spacetype'.
	 * @see #__DNA__FIELD__spacetype
	 */
	
	public void setSpacetype(int spacetype) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 32, spacetype);
		} else {
			__io__block.writeInt(__io__address + 16, spacetype);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 36);
		} else {
			return __io__block.readInt(__io__address + 20);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 36, flag);
		} else {
			__io__block.writeInt(__io__address + 20, flag);
		}
	}

	/**
	 * Get method for struct member 'image'.
	 * @see #__DNA__FIELD__image
	 */
	
	public CPointer<Image> getImage() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Image.class};
		return new CPointer<Image>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, Image.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'image'.
	 * @see #__DNA__FIELD__image
	 */
	
	public void setImage(CPointer<Image> image) throws IOException
	{
		long __address = ((image == null) ? 0 : image.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 24, __address);
		}
	}

	/**
	 * Get method for struct member 'iuser'.
	 * @see #__DNA__FIELD__iuser
	 */
	
	public ImageUser getIuser() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ImageUser(__io__address + 48, __io__block, __io__blockTable);
		} else {
			return new ImageUser(__io__address + 28, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'iuser'.
	 * @see #__DNA__FIELD__iuser
	 */
	
	public void setIuser(ImageUser iuser) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 48;
		} else {
			__dna__offset = 28;
		}
		if (__io__equals(iuser, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, iuser)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, iuser);
		} else {
			__io__generic__copy( getIuser(), iuser);
		}
	}

	/**
	 * Get method for struct member 'cumap'.
	 * @see #__DNA__FIELD__cumap
	 */
	
	public CPointer<CurveMapping> getCumap() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 88);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CurveMapping.class};
		return new CPointer<CurveMapping>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, CurveMapping.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'cumap'.
	 * @see #__DNA__FIELD__cumap
	 */
	
	public void setCumap(CPointer<CurveMapping> cumap) throws IOException
	{
		long __address = ((cumap == null) ? 0 : cumap.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 88, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'scopes'.
	 * @see #__DNA__FIELD__scopes
	 */
	
	public Scopes getScopes() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Scopes(__io__address + 96, __io__block, __io__blockTable);
		} else {
			return new Scopes(__io__address + 68, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'scopes'.
	 * @see #__DNA__FIELD__scopes
	 */
	
	public void setScopes(Scopes scopes) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 96;
		} else {
			__dna__offset = 68;
		}
		if (__io__equals(scopes, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, scopes)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, scopes);
		} else {
			__io__generic__copy( getScopes(), scopes);
		}
	}

	/**
	 * Get method for struct member 'sample_line_hist'.
	 * @see #__DNA__FIELD__sample_line_hist
	 */
	
	public Histogram getSample_line_hist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new Histogram(__io__address + 5360, __io__block, __io__blockTable);
		} else {
			return new Histogram(__io__address + 5316, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'sample_line_hist'.
	 * @see #__DNA__FIELD__sample_line_hist
	 */
	
	public void setSample_line_hist(Histogram sample_line_hist) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 5360;
		} else {
			__dna__offset = 5316;
		}
		if (__io__equals(sample_line_hist, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, sample_line_hist)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, sample_line_hist);
		} else {
			__io__generic__copy( getSample_line_hist(), sample_line_hist);
		}
	}

	/**
	 * Get method for struct member 'gpd'.
	 * @see #__DNA__FIELD__gpd
	 */
	
	public CPointer<bGPdata> getGpd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 10520);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 10476);
		}
		Class<?>[] __dna__targetTypes = new Class[]{bGPdata.class};
		return new CPointer<bGPdata>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, bGPdata.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'gpd'.
	 * @see #__DNA__FIELD__gpd
	 */
	
	public void setGpd(CPointer<bGPdata> gpd) throws IOException
	{
		long __address = ((gpd == null) ? 0 : gpd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 10520, __address);
		} else {
			__io__block.writeLong(__io__address + 10476, __address);
		}
	}

	/**
	 * Get method for struct member 'cursor'.
	 * @see #__DNA__FIELD__cursor
	 */
	
	public CArrayFacade<Float> getCursor() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Float.class};
		int[] __dna__dimensions = new int[]{
			2
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Float>(__io__address + 10528, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Float>(__io__address + 10480, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'cursor'.
	 * @see #__DNA__FIELD__cursor
	 */
	
	public void setCursor(CArrayFacade<Float> cursor) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10528;
		} else {
			__dna__offset = 10480;
		}
		if (__io__equals(cursor, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, cursor)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, cursor);
		} else {
			__io__generic__copy( getCursor(), cursor);
		}
	}

	/**
	 * Get method for struct member 'xof'.
	 * @see #__DNA__FIELD__xof
	 */
	
	public float getXof() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 10536);
		} else {
			return __io__block.readFloat(__io__address + 10488);
		}
	}

	/**
	 * Set method for struct member 'xof'.
	 * @see #__DNA__FIELD__xof
	 */
	
	public void setXof(float xof) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 10536, xof);
		} else {
			__io__block.writeFloat(__io__address + 10488, xof);
		}
	}

	/**
	 * Get method for struct member 'yof'.
	 * @see #__DNA__FIELD__yof
	 */
	
	public float getYof() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 10540);
		} else {
			return __io__block.readFloat(__io__address + 10492);
		}
	}

	/**
	 * Set method for struct member 'yof'.
	 * @see #__DNA__FIELD__yof
	 */
	
	public void setYof(float yof) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 10540, yof);
		} else {
			__io__block.writeFloat(__io__address + 10492, yof);
		}
	}

	/**
	 * Get method for struct member 'zoom'.
	 * @see #__DNA__FIELD__zoom
	 */
	
	public float getZoom() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 10544);
		} else {
			return __io__block.readFloat(__io__address + 10496);
		}
	}

	/**
	 * Set method for struct member 'zoom'.
	 * @see #__DNA__FIELD__zoom
	 */
	
	public void setZoom(float zoom) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 10544, zoom);
		} else {
			__io__block.writeFloat(__io__address + 10496, zoom);
		}
	}

	/**
	 * Get method for struct member 'centx'.
	 * @see #__DNA__FIELD__centx
	 */
	
	public float getCentx() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 10548);
		} else {
			return __io__block.readFloat(__io__address + 10500);
		}
	}

	/**
	 * Set method for struct member 'centx'.
	 * @see #__DNA__FIELD__centx
	 */
	
	public void setCentx(float centx) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 10548, centx);
		} else {
			__io__block.writeFloat(__io__address + 10500, centx);
		}
	}

	/**
	 * Get method for struct member 'centy'.
	 * @see #__DNA__FIELD__centy
	 */
	
	public float getCenty() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 10552);
		} else {
			return __io__block.readFloat(__io__address + 10504);
		}
	}

	/**
	 * Set method for struct member 'centy'.
	 * @see #__DNA__FIELD__centy
	 */
	
	public void setCenty(float centy) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 10552, centy);
		} else {
			__io__block.writeFloat(__io__address + 10504, centy);
		}
	}

	/**
	 * Get method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public byte getMode() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10556);
		} else {
			return __io__block.readByte(__io__address + 10508);
		}
	}

	/**
	 * Set method for struct member 'mode'.
	 * @see #__DNA__FIELD__mode
	 */
	
	public void setMode(byte mode) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10556, mode);
		} else {
			__io__block.writeByte(__io__address + 10508, mode);
		}
	}

	/**
	 * Get method for struct member 'pin'.
	 * @see #__DNA__FIELD__pin
	 */
	
	public byte getPin() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10557);
		} else {
			return __io__block.readByte(__io__address + 10509);
		}
	}

	/**
	 * Set method for struct member 'pin'.
	 * @see #__DNA__FIELD__pin
	 */
	
	public void setPin(byte pin) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10557, pin);
		} else {
			__io__block.writeByte(__io__address + 10509, pin);
		}
	}

	/**
	 * Get method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public short getPad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10558);
		} else {
			return __io__block.readShort(__io__address + 10510);
		}
	}

	/**
	 * Set method for struct member 'pad'.
	 * @see #__DNA__FIELD__pad
	 */
	
	public void setPad(short pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10558, pad);
		} else {
			__io__block.writeShort(__io__address + 10510, pad);
		}
	}

	/**
	 * Get method for struct member 'curtile'.
	 * @see #__DNA__FIELD__curtile
	 */
	
	public short getCurtile() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10560);
		} else {
			return __io__block.readShort(__io__address + 10512);
		}
	}

	/**
	 * Set method for struct member 'curtile'.
	 * @see #__DNA__FIELD__curtile
	 */
	
	public void setCurtile(short curtile) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10560, curtile);
		} else {
			__io__block.writeShort(__io__address + 10512, curtile);
		}
	}

	/**
	 * Get method for struct member 'lock'.
	 * @see #__DNA__FIELD__lock
	 */
	
	public short getLock() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 10562);
		} else {
			return __io__block.readShort(__io__address + 10514);
		}
	}

	/**
	 * Set method for struct member 'lock'.
	 * @see #__DNA__FIELD__lock
	 */
	
	public void setLock(short lock) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 10562, lock);
		} else {
			__io__block.writeShort(__io__address + 10514, lock);
		}
	}

	/**
	 * Get method for struct member 'dt_uv'.
	 * @see #__DNA__FIELD__dt_uv
	 */
	
	public byte getDt_uv() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10564);
		} else {
			return __io__block.readByte(__io__address + 10516);
		}
	}

	/**
	 * Set method for struct member 'dt_uv'.
	 * @see #__DNA__FIELD__dt_uv
	 */
	
	public void setDt_uv(byte dt_uv) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10564, dt_uv);
		} else {
			__io__block.writeByte(__io__address + 10516, dt_uv);
		}
	}

	/**
	 * Get method for struct member 'sticky'.
	 * @see #__DNA__FIELD__sticky
	 */
	
	public byte getSticky() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10565);
		} else {
			return __io__block.readByte(__io__address + 10517);
		}
	}

	/**
	 * Set method for struct member 'sticky'.
	 * @see #__DNA__FIELD__sticky
	 */
	
	public void setSticky(byte sticky) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10565, sticky);
		} else {
			__io__block.writeByte(__io__address + 10517, sticky);
		}
	}

	/**
	 * Get method for struct member 'dt_uvstretch'.
	 * @see #__DNA__FIELD__dt_uvstretch
	 */
	
	public byte getDt_uvstretch() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10566);
		} else {
			return __io__block.readByte(__io__address + 10518);
		}
	}

	/**
	 * Set method for struct member 'dt_uvstretch'.
	 * @see #__DNA__FIELD__dt_uvstretch
	 */
	
	public void setDt_uvstretch(byte dt_uvstretch) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10566, dt_uvstretch);
		} else {
			__io__block.writeByte(__io__address + 10518, dt_uvstretch);
		}
	}

	/**
	 * Get method for struct member 'around'.
	 * @see #__DNA__FIELD__around
	 */
	
	public byte getAround() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readByte(__io__address + 10567);
		} else {
			return __io__block.readByte(__io__address + 10519);
		}
	}

	/**
	 * Set method for struct member 'around'.
	 * @see #__DNA__FIELD__around
	 */
	
	public void setAround(byte around) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeByte(__io__address + 10567, around);
		} else {
			__io__block.writeByte(__io__address + 10519, around);
		}
	}

	/**
	 * Get method for struct member 'mask_info'.
	 * @see #__DNA__FIELD__mask_info
	 */
	
	public MaskSpaceInfo getMask_info() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new MaskSpaceInfo(__io__address + 10568, __io__block, __io__blockTable);
		} else {
			return new MaskSpaceInfo(__io__address + 10520, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'mask_info'.
	 * @see #__DNA__FIELD__mask_info
	 */
	
	public void setMask_info(MaskSpaceInfo mask_info) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 10568;
		} else {
			__dna__offset = 10520;
		}
		if (__io__equals(mask_info, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, mask_info)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, mask_info);
		} else {
			__io__generic__copy( getMask_info(), mask_info);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<SpaceImage> __io__addressof() {
		return new CPointer<SpaceImage>(__io__address, new Class[]{SpaceImage.class}, __io__block, __io__blockTable);
	}

}