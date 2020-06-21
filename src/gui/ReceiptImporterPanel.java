pare_nodes_fn	rbto_compare_nodes;
	rb_compare_key_fn	rbto_compare_key;
};

struct rb_tree {
	struct rb_node *rbt_root;
#ifdef RBDEBUG
	struct rb_node_qh rbt_nodes;
#endif
	const struct rb_tree_ops *rbt_ops;
#ifdef RBDEBUG
	unsigned int rbt_count;
#endif
};

void	_prop_rb_tree_init(struct rb_tree *, const struct rb_tree_ops *);
bool	_prop_rb_tree_insert_node(struct rb_tree *, struct rb_node *);
struct rb_node	*
	_prop_rb_tree_find(struct rb_tree *, const void *);
void	_prop_rb_tree_remove_node(struct rb_tree *, struct rb_node *);
#ifdef RBDEBUG
void	_prop_rb_tree_check(const struct rb_tree *, bool);
#endif
struct rb_node *
	_prop_rb_tree_iterate(struct rb_tree *, struct rb_node *, unsigned int);

#endif /* __NetBSD__ */

#endif	/* _PROP_RB_IMPL_H_*/
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              