package org.blender.dna;

import java.io.IOException;
import org.cakelab.blender.io.block.Block;
import org.cakelab.blender.io.block.BlockTable;
import org.cakelab.blender.nio.CArrayFacade;
import org.cakelab.blender.nio.CFacade;
import org.cakelab.blender.nio.CMetaData;
import org.cakelab.blender.nio.CPointer;


/**
 * Generated facet for DNA struct type 'ParticleSystem'.
 * 
 * <h3>Class Documentation</h3>
 * 
 */

@CMetaData(size32=536, size64=656)
public class ParticleSystem extends CFacade {

	/**
	 * This is the sdna index of the struct ParticleSystem.
	 * <p>
	 * It is required when allocating a new block to store data for ParticleSystem.
	 * </p>
	 * @see {@link org.cakelab.blender.io.dna.internal.StructDNA}
	 * @see {@link org.cakelab.blender.io.block.BlockTable#allocate}
	 */
	public static final int __DNA__SDNA_INDEX = 452;

	/**
	 * Field descriptor (offset) for struct member 'next'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__next);
	 * CPointer&lt;CPointer&lt;ParticleSystem&gt;&gt; p_next = p.cast(new Class[]{CPointer.class, ParticleSystem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'next'</li>
	 * <li>Signature: 'ParticleSystem*'</li>
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
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__prev);
	 * CPointer&lt;CPointer&lt;ParticleSystem&gt;&gt; p_prev = p.cast(new Class[]{CPointer.class, ParticleSystem.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'prev'</li>
	 * <li>Signature: 'ParticleSystem*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__prev = new long[]{4, 8};

	/**
	 * Field descriptor (offset) for struct member 'part'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__part);
	 * CPointer&lt;CPointer&lt;ParticleSettings&gt;&gt; p_part = p.cast(new Class[]{CPointer.class, ParticleSettings.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'part'</li>
	 * <li>Signature: 'ParticleSettings*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__part = new long[]{8, 16};

	/**
	 * Field descriptor (offset) for struct member 'particles'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__particles);
	 * CPointer&lt;CPointer&lt;ParticleData&gt;&gt; p_particles = p.cast(new Class[]{CPointer.class, ParticleData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'particles'</li>
	 * <li>Signature: 'ParticleData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__particles = new long[]{12, 24};

	/**
	 * Field descriptor (offset) for struct member 'child'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__child);
	 * CPointer&lt;CPointer&lt;ChildParticle&gt;&gt; p_child = p.cast(new Class[]{CPointer.class, ChildParticle.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'child'</li>
	 * <li>Signature: 'ChildParticle*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__child = new long[]{16, 32};

	/**
	 * Field descriptor (offset) for struct member 'edit'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__edit);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_edit = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'edit'</li>
	 * <li>Signature: 'PTCacheEdit*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__edit = new long[]{20, 40};

	/**
	 * Field descriptor (offset) for struct member 'pathcache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__pathcache);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Object&gt;&gt;&gt; p_pathcache = p.cast(new Class[]{CPointer.class, CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathcache'</li>
	 * <li>Signature: 'ParticleCacheKey**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathcache = new long[]{28, 56};

	/**
	 * Field descriptor (offset) for struct member 'childcache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__childcache);
	 * CPointer&lt;CPointer&lt;CPointer&lt;Object&gt;&gt;&gt; p_childcache = p.cast(new Class[]{CPointer.class, CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'childcache'</li>
	 * <li>Signature: 'ParticleCacheKey**'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__childcache = new long[]{32, 64};

	/**
	 * Field descriptor (offset) for struct member 'pathcachebufs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__pathcachebufs);
	 * CPointer&lt;ListBase&gt; p_pathcachebufs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pathcachebufs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pathcachebufs = new long[]{36, 72};

	/**
	 * Field descriptor (offset) for struct member 'childcachebufs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__childcachebufs);
	 * CPointer&lt;ListBase&gt; p_childcachebufs = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'childcachebufs'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__childcachebufs = new long[]{44, 88};

	/**
	 * Field descriptor (offset) for struct member 'clmd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__clmd);
	 * CPointer&lt;CPointer&lt;ClothModifierData&gt;&gt; p_clmd = p.cast(new Class[]{CPointer.class, ClothModifierData.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'clmd'</li>
	 * <li>Signature: 'ClothModifierData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__clmd = new long[]{52, 104};

	/**
	 * Field descriptor (offset) for struct member 'hair_in_dm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__hair_in_dm);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_hair_in_dm = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hair_in_dm'</li>
	 * <li>Signature: 'DerivedMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hair_in_dm = new long[]{56, 112};

	/**
	 * Field descriptor (offset) for struct member 'hair_out_dm'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__hair_out_dm);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_hair_out_dm = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'hair_out_dm'</li>
	 * <li>Signature: 'DerivedMesh*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__hair_out_dm = new long[]{60, 120};

	/**
	 * Field descriptor (offset) for struct member 'target_ob'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__target_ob);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_target_ob = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target_ob'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target_ob = new long[]{64, 128};

	/**
	 * Field descriptor (offset) for struct member 'lattice_deform_data'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__lattice_deform_data);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_lattice_deform_data = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'lattice_deform_data'</li>
	 * <li>Signature: 'LatticeDeformData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__lattice_deform_data = new long[]{68, 136};

	/**
	 * Field descriptor (offset) for struct member 'parent'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__parent);
	 * CPointer&lt;CPointer&lt;BlenderObject&gt;&gt; p_parent = p.cast(new Class[]{CPointer.class, BlenderObject.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'parent'</li>
	 * <li>Signature: 'Object*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__parent = new long[]{72, 144};

	/**
	 * Field descriptor (offset) for struct member 'targets'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__targets);
	 * CPointer&lt;ListBase&gt; p_targets = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'targets'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__targets = new long[]{76, 152};

	/**
	 * Field descriptor (offset) for struct member 'name'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__name);
	 * CPointer&lt;CArrayFacade&lt;Byte&gt;&gt; p_name = p.cast(new Class[]{CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'name'</li>
	 * <li>Signature: 'char[64]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__name = new long[]{84, 168};

	/**
	 * Field descriptor (offset) for struct member 'imat'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__imat);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Float&gt;&gt;&gt; p_imat = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'imat'</li>
	 * <li>Signature: 'float[4][4]'</li>
	 * <li>Actual Size (32bit/64bit): 64/64</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__imat = new long[]{148, 232};

	/**
	 * Field descriptor (offset) for struct member 'cfra'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__cfra);
	 * CPointer&lt;Float&gt; p_cfra = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'cfra'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__cfra = new long[]{212, 296};

	/**
	 * Field descriptor (offset) for struct member 'tree_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__tree_frame);
	 * CPointer&lt;Float&gt; p_tree_frame = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tree_frame'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tree_frame = new long[]{216, 300};

	/**
	 * Field descriptor (offset) for struct member 'bvhtree_frame'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__bvhtree_frame);
	 * CPointer&lt;Float&gt; p_bvhtree_frame = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bvhtree_frame'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bvhtree_frame = new long[]{220, 304};

	/**
	 * Field descriptor (offset) for struct member 'seed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__seed);
	 * CPointer&lt;Integer&gt; p_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__seed = new long[]{224, 308};

	/**
	 * Field descriptor (offset) for struct member 'child_seed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__child_seed);
	 * CPointer&lt;Integer&gt; p_child_seed = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'child_seed'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__child_seed = new long[]{228, 312};

	/**
	 * Field descriptor (offset) for struct member 'flag'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__flag);
	 * CPointer&lt;Integer&gt; p_flag = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'flag'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__flag = new long[]{232, 316};

	/**
	 * Field descriptor (offset) for struct member 'totpart'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__totpart);
	 * CPointer&lt;Integer&gt; p_totpart = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totpart'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totpart = new long[]{236, 320};

	/**
	 * Field descriptor (offset) for struct member 'totunexist'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__totunexist);
	 * CPointer&lt;Integer&gt; p_totunexist = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totunexist'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totunexist = new long[]{240, 324};

	/**
	 * Field descriptor (offset) for struct member 'totchild'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__totchild);
	 * CPointer&lt;Integer&gt; p_totchild = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totchild'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totchild = new long[]{244, 328};

	/**
	 * Field descriptor (offset) for struct member 'totcached'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__totcached);
	 * CPointer&lt;Integer&gt; p_totcached = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totcached'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totcached = new long[]{248, 332};

	/**
	 * Field descriptor (offset) for struct member 'totchildcache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__totchildcache);
	 * CPointer&lt;Integer&gt; p_totchildcache = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totchildcache'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totchildcache = new long[]{252, 336};

	/**
	 * Field descriptor (offset) for struct member 'recalc'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__recalc);
	 * CPointer&lt;Short&gt; p_recalc = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'recalc'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__recalc = new long[]{256, 340};

	/**
	 * Field descriptor (offset) for struct member 'target_psys'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__target_psys);
	 * CPointer&lt;Short&gt; p_target_psys = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'target_psys'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__target_psys = new long[]{258, 342};

	/**
	 * Field descriptor (offset) for struct member 'totkeyed'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__totkeyed);
	 * CPointer&lt;Short&gt; p_totkeyed = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'totkeyed'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__totkeyed = new long[]{260, 344};

	/**
	 * Field descriptor (offset) for struct member 'bakespace'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__bakespace);
	 * CPointer&lt;Short&gt; p_bakespace = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bakespace'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bakespace = new long[]{262, 346};

	/**
	 * Field descriptor (offset) for struct member 'bb_uvname'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__bb_uvname);
	 * CPointer&lt;CArrayFacade&lt;CArrayFacade&lt;Byte&gt;&gt;&gt; p_bb_uvname = p.cast(new Class[]{CArrayFacade.class, CArrayFacade.class, Byte.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bb_uvname'</li>
	 * <li>Signature: 'char[3][64]'</li>
	 * <li>Actual Size (32bit/64bit): 192/192</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bb_uvname = new long[]{264, 348};

	/**
	 * Field descriptor (offset) for struct member 'vgroup'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__vgroup);
	 * CPointer&lt;CArrayFacade&lt;Short&gt;&gt; p_vgroup = p.cast(new Class[]{CArrayFacade.class, Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vgroup'</li>
	 * <li>Signature: 'short[12]'</li>
	 * <li>Actual Size (32bit/64bit): 24/24</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vgroup = new long[]{456, 540};

	/**
	 * Field descriptor (offset) for struct member 'vg_neg'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__vg_neg);
	 * CPointer&lt;Short&gt; p_vg_neg = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'vg_neg'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__vg_neg = new long[]{480, 564};

	/**
	 * Field descriptor (offset) for struct member 'rt3'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__rt3);
	 * CPointer&lt;Short&gt; p_rt3 = p.cast(new Class[]{Short.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'rt3'</li>
	 * <li>Signature: 'short'</li>
	 * <li>Actual Size (32bit/64bit): 2/2</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__rt3 = new long[]{482, 566};

	/**
	 * Field descriptor (offset) for struct member 'renderdata'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__renderdata);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_renderdata = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'renderdata'</li>
	 * <li>Signature: 'ParticleRenderData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__renderdata = new long[]{484, 568};

	/**
	 * Field descriptor (offset) for struct member 'pointcache'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__pointcache);
	 * CPointer&lt;CPointer&lt;PointCache&gt;&gt; p_pointcache = p.cast(new Class[]{CPointer.class, PointCache.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pointcache'</li>
	 * <li>Signature: 'PointCache*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pointcache = new long[]{488, 576};

	/**
	 * Field descriptor (offset) for struct member 'ptcaches'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__ptcaches);
	 * CPointer&lt;ListBase&gt; p_ptcaches = p.cast(new Class[]{ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'ptcaches'</li>
	 * <li>Signature: 'ListBase'</li>
	 * <li>Actual Size (32bit/64bit): 8/16</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__ptcaches = new long[]{492, 584};

	/**
	 * Field descriptor (offset) for struct member 'effectors'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__effectors);
	 * CPointer&lt;CPointer&lt;ListBase&gt;&gt; p_effectors = p.cast(new Class[]{CPointer.class, ListBase.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'effectors'</li>
	 * <li>Signature: 'ListBase*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__effectors = new long[]{500, 600};

	/**
	 * Field descriptor (offset) for struct member 'fluid_springs'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__fluid_springs);
	 * CPointer&lt;CPointer&lt;ParticleSpring&gt;&gt; p_fluid_springs = p.cast(new Class[]{CPointer.class, ParticleSpring.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'fluid_springs'</li>
	 * <li>Signature: 'ParticleSpring*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__fluid_springs = new long[]{504, 608};

	/**
	 * Field descriptor (offset) for struct member 'tot_fluidsprings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__tot_fluidsprings);
	 * CPointer&lt;Integer&gt; p_tot_fluidsprings = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tot_fluidsprings'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tot_fluidsprings = new long[]{508, 616};

	/**
	 * Field descriptor (offset) for struct member 'alloc_fluidsprings'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__alloc_fluidsprings);
	 * CPointer&lt;Integer&gt; p_alloc_fluidsprings = p.cast(new Class[]{Integer.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'alloc_fluidsprings'</li>
	 * <li>Signature: 'int'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__alloc_fluidsprings = new long[]{512, 620};

	/**
	 * Field descriptor (offset) for struct member 'tree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__tree);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_tree = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'tree'</li>
	 * <li>Signature: 'KDTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__tree = new long[]{516, 624};

	/**
	 * Field descriptor (offset) for struct member 'bvhtree'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__bvhtree);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_bvhtree = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'bvhtree'</li>
	 * <li>Signature: 'BVHTree*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__bvhtree = new long[]{520, 632};

	/**
	 * Field descriptor (offset) for struct member 'pdd'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__pdd);
	 * CPointer&lt;CPointer&lt;Object&gt;&gt; p_pdd = p.cast(new Class[]{CPointer.class, Object.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'pdd'</li>
	 * <li>Signature: 'ParticleDrawData*'</li>
	 * <li>Actual Size (32bit/64bit): 4/8</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__pdd = new long[]{524, 640};

	/**
	 * Field descriptor (offset) for struct member 'dt_frac'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD__dt_frac);
	 * CPointer&lt;Float&gt; p_dt_frac = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: 'dt_frac'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD__dt_frac = new long[]{528, 648};

	/**
	 * Field descriptor (offset) for struct member '_pad'.
	 * <h3>Pointer Arithmetics</h3>
	 * <p>
	 * This is how you get a reference on the corresponding field in the struct:
	 * </p>
	 * <pre>
	 * ParticleSystem particlesystem = ...;
	 * CPointer&lt;Object&gt; p = particlesystem.__dna__addressof(ParticleSystem.__DNA__FIELD___pad);
	 * CPointer&lt;Float&gt; p__pad = p.cast(new Class[]{Float.class});
	 * </pre>
	 * <h3>Metadata</h3>
	 * <ul>
	 * <li>Field: '_pad'</li>
	 * <li>Signature: 'float'</li>
	 * <li>Actual Size (32bit/64bit): 4/4</li>
	 * </ul>
	 */
	public static final long[] __DNA__FIELD___pad = new long[]{532, 652};

	public ParticleSystem(long __address, Block __block, BlockTable __blockTable) {
		super(__address, __block, __blockTable);
	}

	protected ParticleSystem(ParticleSystem that) {
		super(that.__io__address, that.__io__block, that.__io__blockTable);
	}

	/**
	 * Get method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public CPointer<ParticleSystem> getNext() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 0);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSystem.class};
		return new CPointer<ParticleSystem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSystem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'next'.
	 * @see #__DNA__FIELD__next
	 */
	
	public void setNext(CPointer<ParticleSystem> next) throws IOException
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
	
	public CPointer<ParticleSystem> getPrev() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 4);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSystem.class};
		return new CPointer<ParticleSystem>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSystem.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'prev'.
	 * @see #__DNA__FIELD__prev
	 */
	
	public void setPrev(CPointer<ParticleSystem> prev) throws IOException
	{
		long __address = ((prev == null) ? 0 : prev.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 8, __address);
		} else {
			__io__block.writeLong(__io__address + 4, __address);
		}
	}

	/**
	 * Get method for struct member 'part'.
	 * @see #__DNA__FIELD__part
	 */
	
	public CPointer<ParticleSettings> getPart() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 8);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSettings.class};
		return new CPointer<ParticleSettings>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSettings.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'part'.
	 * @see #__DNA__FIELD__part
	 */
	
	public void setPart(CPointer<ParticleSettings> part) throws IOException
	{
		long __address = ((part == null) ? 0 : part.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 16, __address);
		} else {
			__io__block.writeLong(__io__address + 8, __address);
		}
	}

	/**
	 * Get method for struct member 'particles'.
	 * @see #__DNA__FIELD__particles
	 */
	
	public CPointer<ParticleData> getParticles() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 24);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 12);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleData.class};
		return new CPointer<ParticleData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'particles'.
	 * @see #__DNA__FIELD__particles
	 */
	
	public void setParticles(CPointer<ParticleData> particles) throws IOException
	{
		long __address = ((particles == null) ? 0 : particles.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 24, __address);
		} else {
			__io__block.writeLong(__io__address + 12, __address);
		}
	}

	/**
	 * Get method for struct member 'child'.
	 * @see #__DNA__FIELD__child
	 */
	
	public CPointer<ChildParticle> getChild() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 16);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ChildParticle.class};
		return new CPointer<ChildParticle>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ChildParticle.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'child'.
	 * @see #__DNA__FIELD__child
	 */
	
	public void setChild(CPointer<ChildParticle> child) throws IOException
	{
		long __address = ((child == null) ? 0 : child.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 32, __address);
		} else {
			__io__block.writeLong(__io__address + 16, __address);
		}
	}

	/**
	 * Get method for struct member 'edit'.
	 * @see #__DNA__FIELD__edit
	 */
	
	public CPointer<Object> getEdit() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 40);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 20);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'edit'.
	 * @see #__DNA__FIELD__edit
	 */
	
	public void setEdit(CPointer<Object> edit) throws IOException
	{
		long __address = ((edit == null) ? 0 : edit.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 40, __address);
		} else {
			__io__block.writeLong(__io__address + 20, __address);
		}
	}

	/**
	 * Get method for struct member 'pathcache'.
	 * @see #__DNA__FIELD__pathcache
	 */
	
	public CPointer<CPointer<Object>> getPathcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 28);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Object.class};
		return new CPointer<CPointer<Object>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pathcache'.
	 * @see #__DNA__FIELD__pathcache
	 */
	
	public void setPathcache(CPointer<CPointer<Object>> pathcache) throws IOException
	{
		long __address = ((pathcache == null) ? 0 : pathcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 56, __address);
		} else {
			__io__block.writeLong(__io__address + 28, __address);
		}
	}

	/**
	 * Get method for struct member 'childcache'.
	 * @see #__DNA__FIELD__childcache
	 */
	
	public CPointer<CPointer<Object>> getChildcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 32);
		}
		Class<?>[] __dna__targetTypes = new Class[]{CPointer.class, Object.class};
		return new CPointer<CPointer<Object>>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, __dna__targetTypes), __io__blockTable);
	}

	/**
	 * Set method for struct member 'childcache'.
	 * @see #__DNA__FIELD__childcache
	 */
	
	public void setChildcache(CPointer<CPointer<Object>> childcache) throws IOException
	{
		long __address = ((childcache == null) ? 0 : childcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 64, __address);
		} else {
			__io__block.writeLong(__io__address + 32, __address);
		}
	}

	/**
	 * Get method for struct member 'pathcachebufs'.
	 * @see #__DNA__FIELD__pathcachebufs
	 */
	
	public ListBase getPathcachebufs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 72, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 36, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'pathcachebufs'.
	 * @see #__DNA__FIELD__pathcachebufs
	 */
	
	public void setPathcachebufs(ListBase pathcachebufs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 72;
		} else {
			__dna__offset = 36;
		}
		if (__io__equals(pathcachebufs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, pathcachebufs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, pathcachebufs);
		} else {
			__io__generic__copy( getPathcachebufs(), pathcachebufs);
		}
	}

	/**
	 * Get method for struct member 'childcachebufs'.
	 * @see #__DNA__FIELD__childcachebufs
	 */
	
	public ListBase getChildcachebufs() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 88, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 44, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'childcachebufs'.
	 * @see #__DNA__FIELD__childcachebufs
	 */
	
	public void setChildcachebufs(ListBase childcachebufs) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 88;
		} else {
			__dna__offset = 44;
		}
		if (__io__equals(childcachebufs, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, childcachebufs)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, childcachebufs);
		} else {
			__io__generic__copy( getChildcachebufs(), childcachebufs);
		}
	}

	/**
	 * Get method for struct member 'clmd'.
	 * @see #__DNA__FIELD__clmd
	 */
	
	public CPointer<ClothModifierData> getClmd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 104);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 52);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ClothModifierData.class};
		return new CPointer<ClothModifierData>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ClothModifierData.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'clmd'.
	 * @see #__DNA__FIELD__clmd
	 */
	
	public void setClmd(CPointer<ClothModifierData> clmd) throws IOException
	{
		long __address = ((clmd == null) ? 0 : clmd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 104, __address);
		} else {
			__io__block.writeLong(__io__address + 52, __address);
		}
	}

	/**
	 * Get method for struct member 'hair_in_dm'.
	 * @see #__DNA__FIELD__hair_in_dm
	 */
	
	public CPointer<Object> getHair_in_dm() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 112);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 56);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'hair_in_dm'.
	 * @see #__DNA__FIELD__hair_in_dm
	 */
	
	public void setHair_in_dm(CPointer<Object> hair_in_dm) throws IOException
	{
		long __address = ((hair_in_dm == null) ? 0 : hair_in_dm.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 112, __address);
		} else {
			__io__block.writeLong(__io__address + 56, __address);
		}
	}

	/**
	 * Get method for struct member 'hair_out_dm'.
	 * @see #__DNA__FIELD__hair_out_dm
	 */
	
	public CPointer<Object> getHair_out_dm() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 120);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 60);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'hair_out_dm'.
	 * @see #__DNA__FIELD__hair_out_dm
	 */
	
	public void setHair_out_dm(CPointer<Object> hair_out_dm) throws IOException
	{
		long __address = ((hair_out_dm == null) ? 0 : hair_out_dm.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 120, __address);
		} else {
			__io__block.writeLong(__io__address + 60, __address);
		}
	}

	/**
	 * Get method for struct member 'target_ob'.
	 * @see #__DNA__FIELD__target_ob
	 */
	
	public CPointer<BlenderObject> getTarget_ob() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 128);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 64);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'target_ob'.
	 * @see #__DNA__FIELD__target_ob
	 */
	
	public void setTarget_ob(CPointer<BlenderObject> target_ob) throws IOException
	{
		long __address = ((target_ob == null) ? 0 : target_ob.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 128, __address);
		} else {
			__io__block.writeLong(__io__address + 64, __address);
		}
	}

	/**
	 * Get method for struct member 'lattice_deform_data'.
	 * @see #__DNA__FIELD__lattice_deform_data
	 */
	
	public CPointer<Object> getLattice_deform_data() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 136);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 68);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'lattice_deform_data'.
	 * @see #__DNA__FIELD__lattice_deform_data
	 */
	
	public void setLattice_deform_data(CPointer<Object> lattice_deform_data) throws IOException
	{
		long __address = ((lattice_deform_data == null) ? 0 : lattice_deform_data.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 136, __address);
		} else {
			__io__block.writeLong(__io__address + 68, __address);
		}
	}

	/**
	 * Get method for struct member 'parent'.
	 * @see #__DNA__FIELD__parent
	 */
	
	public CPointer<BlenderObject> getParent() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 144);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 72);
		}
		Class<?>[] __dna__targetTypes = new Class[]{BlenderObject.class};
		return new CPointer<BlenderObject>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, BlenderObject.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'parent'.
	 * @see #__DNA__FIELD__parent
	 */
	
	public void setParent(CPointer<BlenderObject> parent) throws IOException
	{
		long __address = ((parent == null) ? 0 : parent.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 144, __address);
		} else {
			__io__block.writeLong(__io__address + 72, __address);
		}
	}

	/**
	 * Get method for struct member 'targets'.
	 * @see #__DNA__FIELD__targets
	 */
	
	public ListBase getTargets() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 152, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 76, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'targets'.
	 * @see #__DNA__FIELD__targets
	 */
	
	public void setTargets(ListBase targets) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 152;
		} else {
			__dna__offset = 76;
		}
		if (__io__equals(targets, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, targets)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, targets);
		} else {
			__io__generic__copy( getTargets(), targets);
		}
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
			return new CArrayFacade<Byte>(__io__address + 168, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Byte>(__io__address + 84, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
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
			__dna__offset = 168;
		} else {
			__dna__offset = 84;
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
	 * Get method for struct member 'imat'.
	 * @see #__DNA__FIELD__imat
	 */
	
	public CArrayFacade<CArrayFacade<Float>> getImat() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Float.class};
		int[] __dna__dimensions = new int[]{
			4,
			4
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 232, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Float>>(__io__address + 148, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'imat'.
	 * @see #__DNA__FIELD__imat
	 */
	
	public void setImat(CArrayFacade<CArrayFacade<Float>> imat) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 232;
		} else {
			__dna__offset = 148;
		}
		if (__io__equals(imat, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, imat)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, imat);
		} else {
			__io__generic__copy( getImat(), imat);
		}
	}

	/**
	 * Get method for struct member 'cfra'.
	 * @see #__DNA__FIELD__cfra
	 */
	
	public float getCfra() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 296);
		} else {
			return __io__block.readFloat(__io__address + 212);
		}
	}

	/**
	 * Set method for struct member 'cfra'.
	 * @see #__DNA__FIELD__cfra
	 */
	
	public void setCfra(float cfra) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 296, cfra);
		} else {
			__io__block.writeFloat(__io__address + 212, cfra);
		}
	}

	/**
	 * Get method for struct member 'tree_frame'.
	 * @see #__DNA__FIELD__tree_frame
	 */
	
	public float getTree_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 300);
		} else {
			return __io__block.readFloat(__io__address + 216);
		}
	}

	/**
	 * Set method for struct member 'tree_frame'.
	 * @see #__DNA__FIELD__tree_frame
	 */
	
	public void setTree_frame(float tree_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 300, tree_frame);
		} else {
			__io__block.writeFloat(__io__address + 216, tree_frame);
		}
	}

	/**
	 * Get method for struct member 'bvhtree_frame'.
	 * @see #__DNA__FIELD__bvhtree_frame
	 */
	
	public float getBvhtree_frame() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 304);
		} else {
			return __io__block.readFloat(__io__address + 220);
		}
	}

	/**
	 * Set method for struct member 'bvhtree_frame'.
	 * @see #__DNA__FIELD__bvhtree_frame
	 */
	
	public void setBvhtree_frame(float bvhtree_frame) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 304, bvhtree_frame);
		} else {
			__io__block.writeFloat(__io__address + 220, bvhtree_frame);
		}
	}

	/**
	 * Get method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public int getSeed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 308);
		} else {
			return __io__block.readInt(__io__address + 224);
		}
	}

	/**
	 * Set method for struct member 'seed'.
	 * @see #__DNA__FIELD__seed
	 */
	
	public void setSeed(int seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 308, seed);
		} else {
			__io__block.writeInt(__io__address + 224, seed);
		}
	}

	/**
	 * Get method for struct member 'child_seed'.
	 * @see #__DNA__FIELD__child_seed
	 */
	
	public int getChild_seed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 312);
		} else {
			return __io__block.readInt(__io__address + 228);
		}
	}

	/**
	 * Set method for struct member 'child_seed'.
	 * @see #__DNA__FIELD__child_seed
	 */
	
	public void setChild_seed(int child_seed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 312, child_seed);
		} else {
			__io__block.writeInt(__io__address + 228, child_seed);
		}
	}

	/**
	 * Get method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public int getFlag() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 316);
		} else {
			return __io__block.readInt(__io__address + 232);
		}
	}

	/**
	 * Set method for struct member 'flag'.
	 * @see #__DNA__FIELD__flag
	 */
	
	public void setFlag(int flag) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 316, flag);
		} else {
			__io__block.writeInt(__io__address + 232, flag);
		}
	}

	/**
	 * Get method for struct member 'totpart'.
	 * @see #__DNA__FIELD__totpart
	 */
	
	public int getTotpart() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 320);
		} else {
			return __io__block.readInt(__io__address + 236);
		}
	}

	/**
	 * Set method for struct member 'totpart'.
	 * @see #__DNA__FIELD__totpart
	 */
	
	public void setTotpart(int totpart) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 320, totpart);
		} else {
			__io__block.writeInt(__io__address + 236, totpart);
		}
	}

	/**
	 * Get method for struct member 'totunexist'.
	 * @see #__DNA__FIELD__totunexist
	 */
	
	public int getTotunexist() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 324);
		} else {
			return __io__block.readInt(__io__address + 240);
		}
	}

	/**
	 * Set method for struct member 'totunexist'.
	 * @see #__DNA__FIELD__totunexist
	 */
	
	public void setTotunexist(int totunexist) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 324, totunexist);
		} else {
			__io__block.writeInt(__io__address + 240, totunexist);
		}
	}

	/**
	 * Get method for struct member 'totchild'.
	 * @see #__DNA__FIELD__totchild
	 */
	
	public int getTotchild() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 328);
		} else {
			return __io__block.readInt(__io__address + 244);
		}
	}

	/**
	 * Set method for struct member 'totchild'.
	 * @see #__DNA__FIELD__totchild
	 */
	
	public void setTotchild(int totchild) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 328, totchild);
		} else {
			__io__block.writeInt(__io__address + 244, totchild);
		}
	}

	/**
	 * Get method for struct member 'totcached'.
	 * @see #__DNA__FIELD__totcached
	 */
	
	public int getTotcached() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 332);
		} else {
			return __io__block.readInt(__io__address + 248);
		}
	}

	/**
	 * Set method for struct member 'totcached'.
	 * @see #__DNA__FIELD__totcached
	 */
	
	public void setTotcached(int totcached) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 332, totcached);
		} else {
			__io__block.writeInt(__io__address + 248, totcached);
		}
	}

	/**
	 * Get method for struct member 'totchildcache'.
	 * @see #__DNA__FIELD__totchildcache
	 */
	
	public int getTotchildcache() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 336);
		} else {
			return __io__block.readInt(__io__address + 252);
		}
	}

	/**
	 * Set method for struct member 'totchildcache'.
	 * @see #__DNA__FIELD__totchildcache
	 */
	
	public void setTotchildcache(int totchildcache) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 336, totchildcache);
		} else {
			__io__block.writeInt(__io__address + 252, totchildcache);
		}
	}

	/**
	 * Get method for struct member 'recalc'.
	 * @see #__DNA__FIELD__recalc
	 */
	
	public short getRecalc() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 340);
		} else {
			return __io__block.readShort(__io__address + 256);
		}
	}

	/**
	 * Set method for struct member 'recalc'.
	 * @see #__DNA__FIELD__recalc
	 */
	
	public void setRecalc(short recalc) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 340, recalc);
		} else {
			__io__block.writeShort(__io__address + 256, recalc);
		}
	}

	/**
	 * Get method for struct member 'target_psys'.
	 * @see #__DNA__FIELD__target_psys
	 */
	
	public short getTarget_psys() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 342);
		} else {
			return __io__block.readShort(__io__address + 258);
		}
	}

	/**
	 * Set method for struct member 'target_psys'.
	 * @see #__DNA__FIELD__target_psys
	 */
	
	public void setTarget_psys(short target_psys) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 342, target_psys);
		} else {
			__io__block.writeShort(__io__address + 258, target_psys);
		}
	}

	/**
	 * Get method for struct member 'totkeyed'.
	 * @see #__DNA__FIELD__totkeyed
	 */
	
	public short getTotkeyed() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 344);
		} else {
			return __io__block.readShort(__io__address + 260);
		}
	}

	/**
	 * Set method for struct member 'totkeyed'.
	 * @see #__DNA__FIELD__totkeyed
	 */
	
	public void setTotkeyed(short totkeyed) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 344, totkeyed);
		} else {
			__io__block.writeShort(__io__address + 260, totkeyed);
		}
	}

	/**
	 * Get method for struct member 'bakespace'.
	 * @see #__DNA__FIELD__bakespace
	 */
	
	public short getBakespace() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 346);
		} else {
			return __io__block.readShort(__io__address + 262);
		}
	}

	/**
	 * Set method for struct member 'bakespace'.
	 * @see #__DNA__FIELD__bakespace
	 */
	
	public void setBakespace(short bakespace) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 346, bakespace);
		} else {
			__io__block.writeShort(__io__address + 262, bakespace);
		}
	}

	/**
	 * Get method for struct member 'bb_uvname'.
	 * @see #__DNA__FIELD__bb_uvname
	 */
	
	public CArrayFacade<CArrayFacade<Byte>> getBb_uvname() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{CArrayFacade.class, Byte.class};
		int[] __dna__dimensions = new int[]{
			3,
			64
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<CArrayFacade<Byte>>(__io__address + 348, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<CArrayFacade<Byte>>(__io__address + 264, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'bb_uvname'.
	 * @see #__DNA__FIELD__bb_uvname
	 */
	
	public void setBb_uvname(CArrayFacade<CArrayFacade<Byte>> bb_uvname) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 348;
		} else {
			__dna__offset = 264;
		}
		if (__io__equals(bb_uvname, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, bb_uvname)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, bb_uvname);
		} else {
			__io__generic__copy( getBb_uvname(), bb_uvname);
		}
	}

	/**
	 * Get method for struct member 'vgroup'.
	 * @see #__DNA__FIELD__vgroup
	 */
	
	public CArrayFacade<Short> getVgroup() throws IOException
	{
		Class<?>[] __dna__targetTypes = new Class[]{Short.class};
		int[] __dna__dimensions = new int[]{
			12
		};
		if ((__io__pointersize == 8)) {
			return new CArrayFacade<Short>(__io__address + 540, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		} else {
			return new CArrayFacade<Short>(__io__address + 456, __dna__targetTypes, __dna__dimensions, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'vgroup'.
	 * @see #__DNA__FIELD__vgroup
	 */
	
	public void setVgroup(CArrayFacade<Short> vgroup) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 540;
		} else {
			__dna__offset = 456;
		}
		if (__io__equals(vgroup, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, vgroup)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, vgroup);
		} else {
			__io__generic__copy( getVgroup(), vgroup);
		}
	}

	/**
	 * Get method for struct member 'vg_neg'.
	 * @see #__DNA__FIELD__vg_neg
	 */
	
	public short getVg_neg() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 564);
		} else {
			return __io__block.readShort(__io__address + 480);
		}
	}

	/**
	 * Set method for struct member 'vg_neg'.
	 * @see #__DNA__FIELD__vg_neg
	 */
	
	public void setVg_neg(short vg_neg) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 564, vg_neg);
		} else {
			__io__block.writeShort(__io__address + 480, vg_neg);
		}
	}

	/**
	 * Get method for struct member 'rt3'.
	 * @see #__DNA__FIELD__rt3
	 */
	
	public short getRt3() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readShort(__io__address + 566);
		} else {
			return __io__block.readShort(__io__address + 482);
		}
	}

	/**
	 * Set method for struct member 'rt3'.
	 * @see #__DNA__FIELD__rt3
	 */
	
	public void setRt3(short rt3) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeShort(__io__address + 566, rt3);
		} else {
			__io__block.writeShort(__io__address + 482, rt3);
		}
	}

	/**
	 * Get method for struct member 'renderdata'.
	 * @see #__DNA__FIELD__renderdata
	 */
	
	public CPointer<Object> getRenderdata() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 568);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 484);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'renderdata'.
	 * @see #__DNA__FIELD__renderdata
	 */
	
	public void setRenderdata(CPointer<Object> renderdata) throws IOException
	{
		long __address = ((renderdata == null) ? 0 : renderdata.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 568, __address);
		} else {
			__io__block.writeLong(__io__address + 484, __address);
		}
	}

	/**
	 * Get method for struct member 'pointcache'.
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public CPointer<PointCache> getPointcache() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 576);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 488);
		}
		Class<?>[] __dna__targetTypes = new Class[]{PointCache.class};
		return new CPointer<PointCache>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, PointCache.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pointcache'.
	 * @see #__DNA__FIELD__pointcache
	 */
	
	public void setPointcache(CPointer<PointCache> pointcache) throws IOException
	{
		long __address = ((pointcache == null) ? 0 : pointcache.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 576, __address);
		} else {
			__io__block.writeLong(__io__address + 488, __address);
		}
	}

	/**
	 * Get method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public ListBase getPtcaches() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return new ListBase(__io__address + 584, __io__block, __io__blockTable);
		} else {
			return new ListBase(__io__address + 492, __io__block, __io__blockTable);
		}
	}

	/**
	 * Set method for struct member 'ptcaches'.
	 * @see #__DNA__FIELD__ptcaches
	 */
	
	public void setPtcaches(ListBase ptcaches) throws IOException
	{
		long __dna__offset;
		if ((__io__pointersize == 8)) {
			__dna__offset = 584;
		} else {
			__dna__offset = 492;
		}
		if (__io__equals(ptcaches, __io__address + __dna__offset)) {
			return;
		} else if (__io__same__encoding(this, ptcaches)) {
			__io__native__copy(__io__block, __io__address + __dna__offset, ptcaches);
		} else {
			__io__generic__copy( getPtcaches(), ptcaches);
		}
	}

	/**
	 * Get method for struct member 'effectors'.
	 * @see #__DNA__FIELD__effectors
	 */
	
	public CPointer<ListBase> getEffectors() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 600);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 500);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ListBase.class};
		return new CPointer<ListBase>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ListBase.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'effectors'.
	 * @see #__DNA__FIELD__effectors
	 */
	
	public void setEffectors(CPointer<ListBase> effectors) throws IOException
	{
		long __address = ((effectors == null) ? 0 : effectors.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 600, __address);
		} else {
			__io__block.writeLong(__io__address + 500, __address);
		}
	}

	/**
	 * Get method for struct member 'fluid_springs'.
	 * @see #__DNA__FIELD__fluid_springs
	 */
	
	public CPointer<ParticleSpring> getFluid_springs() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 608);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 504);
		}
		Class<?>[] __dna__targetTypes = new Class[]{ParticleSpring.class};
		return new CPointer<ParticleSpring>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, ParticleSpring.__DNA__SDNA_INDEX), __io__blockTable);
	}

	/**
	 * Set method for struct member 'fluid_springs'.
	 * @see #__DNA__FIELD__fluid_springs
	 */
	
	public void setFluid_springs(CPointer<ParticleSpring> fluid_springs) throws IOException
	{
		long __address = ((fluid_springs == null) ? 0 : fluid_springs.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 608, __address);
		} else {
			__io__block.writeLong(__io__address + 504, __address);
		}
	}

	/**
	 * Get method for struct member 'tot_fluidsprings'.
	 * @see #__DNA__FIELD__tot_fluidsprings
	 */
	
	public int getTot_fluidsprings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 616);
		} else {
			return __io__block.readInt(__io__address + 508);
		}
	}

	/**
	 * Set method for struct member 'tot_fluidsprings'.
	 * @see #__DNA__FIELD__tot_fluidsprings
	 */
	
	public void setTot_fluidsprings(int tot_fluidsprings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 616, tot_fluidsprings);
		} else {
			__io__block.writeInt(__io__address + 508, tot_fluidsprings);
		}
	}

	/**
	 * Get method for struct member 'alloc_fluidsprings'.
	 * @see #__DNA__FIELD__alloc_fluidsprings
	 */
	
	public int getAlloc_fluidsprings() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readInt(__io__address + 620);
		} else {
			return __io__block.readInt(__io__address + 512);
		}
	}

	/**
	 * Set method for struct member 'alloc_fluidsprings'.
	 * @see #__DNA__FIELD__alloc_fluidsprings
	 */
	
	public void setAlloc_fluidsprings(int alloc_fluidsprings) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeInt(__io__address + 620, alloc_fluidsprings);
		} else {
			__io__block.writeInt(__io__address + 512, alloc_fluidsprings);
		}
	}

	/**
	 * Get method for struct member 'tree'.
	 * @see #__DNA__FIELD__tree
	 */
	
	public CPointer<Object> getTree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 624);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 516);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'tree'.
	 * @see #__DNA__FIELD__tree
	 */
	
	public void setTree(CPointer<Object> tree) throws IOException
	{
		long __address = ((tree == null) ? 0 : tree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 624, __address);
		} else {
			__io__block.writeLong(__io__address + 516, __address);
		}
	}

	/**
	 * Get method for struct member 'bvhtree'.
	 * @see #__DNA__FIELD__bvhtree
	 */
	
	public CPointer<Object> getBvhtree() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 632);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 520);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'bvhtree'.
	 * @see #__DNA__FIELD__bvhtree
	 */
	
	public void setBvhtree(CPointer<Object> bvhtree) throws IOException
	{
		long __address = ((bvhtree == null) ? 0 : bvhtree.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 632, __address);
		} else {
			__io__block.writeLong(__io__address + 520, __address);
		}
	}

	/**
	 * Get method for struct member 'pdd'.
	 * @see #__DNA__FIELD__pdd
	 */
	
	public CPointer<Object> getPdd() throws IOException
	{
		long __dna__targetAddress;
		if ((__io__pointersize == 8)) {
			__dna__targetAddress = __io__block.readLong(__io__address + 640);
		} else {
			__dna__targetAddress = __io__block.readLong(__io__address + 524);
		}
		Class<?>[] __dna__targetTypes = new Class[]{Object.class};
		return new CPointer<Object>(__dna__targetAddress, __dna__targetTypes, __io__blockTable.getBlock(__dna__targetAddress, -1), __io__blockTable);
	}

	/**
	 * Set method for struct member 'pdd'.
	 * @see #__DNA__FIELD__pdd
	 */
	
	public void setPdd(CPointer<Object> pdd) throws IOException
	{
		long __address = ((pdd == null) ? 0 : pdd.getAddress());
		if ((__io__pointersize == 8)) {
			__io__block.writeLong(__io__address + 640, __address);
		} else {
			__io__block.writeLong(__io__address + 524, __address);
		}
	}

	/**
	 * Get method for struct member 'dt_frac'.
	 * @see #__DNA__FIELD__dt_frac
	 */
	
	public float getDt_frac() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 648);
		} else {
			return __io__block.readFloat(__io__address + 528);
		}
	}

	/**
	 * Set method for struct member 'dt_frac'.
	 * @see #__DNA__FIELD__dt_frac
	 */
	
	public void setDt_frac(float dt_frac) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 648, dt_frac);
		} else {
			__io__block.writeFloat(__io__address + 528, dt_frac);
		}
	}

	/**
	 * Get method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public float get_pad() throws IOException
	{
		if ((__io__pointersize == 8)) {
			return __io__block.readFloat(__io__address + 652);
		} else {
			return __io__block.readFloat(__io__address + 532);
		}
	}

	/**
	 * Set method for struct member '_pad'.
	 * @see #__DNA__FIELD___pad
	 */
	
	public void set_pad(float _pad) throws IOException
	{
		if ((__io__pointersize == 8)) {
			__io__block.writeFloat(__io__address + 652, _pad);
		} else {
			__io__block.writeFloat(__io__address + 532, _pad);
		}
	}

	/**
	 * Instantiates a pointer on this instance.
	 */
	public CPointer<ParticleSystem> __io__addressof() {
		return new CPointer<ParticleSystem>(__io__address, new Class[]{ParticleSystem.class}, __io__block, __io__blockTable);
	}

}
